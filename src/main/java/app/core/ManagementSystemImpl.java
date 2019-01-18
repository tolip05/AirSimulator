package app.core;


import app.additionalcommands.*;
import app.additionalcommands.SelectAirplanesIsFly;
import app.additionalcommands.SelectAirplanesIsFlyImpl;
import app.constants.Constant;
import app.models.interfaces.AirPlane;
import app.models.interfaces.Chopper;
import app.models.interfaces.Enemy;
import app.players.Player;
import app.players.PlayerImpl;
import app.weapons.Arsenal;
import app.weapons.ArsenalImpl;
import app.weapons.Weapon;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class ManagementSystemImpl implements ManagementSystem {

    private static final String NAME = "Pesho";
    private static final int MONEY = 100_000;

    private Player player;
    private Arsenal arsenal;
    private IsFly isFly;
    private PrintIsFlying printIsFlying;
    private ChoicePlane choicePlane;
    private GetWeapons getWeapons;
    private PayWeapons payWeapons;
    private SelectAirplanesIsFly selectAirplanesIsFly;
    private PrintFlyReport printFlyReport;
    private KillTheEnemy killTheEnemy;
    private List<Enemy> enemies;

    public ManagementSystemImpl() {
        this.initializePlayer();
        this.arsenal = new ArsenalImpl();
        this.enemies = new ArrayList<>();
        this.isFly = new IsFlyImpl();
        this.printIsFlying = new PrintIsFlyingImpl();
        this.choicePlane = new ChoicePlaneImpl();
        this.getWeapons = new GetWeaponsImpl();
        this.payWeapons = new PayWeaponsImpl();
        this.selectAirplanesIsFly = new SelectAirplanesIsFlyImpl();
        this.printFlyReport = new PrintFlyReportImpl();
        this.killTheEnemy = new KillTheEnemyImpl();
    }

    private void initializePlayer() {
        player = new PlayerImpl(NAME, MONEY);
    }

    @Override
    public String getAirForce(AirPlane plane) {
        this.player.addAirplane(plane);
        return String.format("You have airforce %s", plane.getClass().getSimpleName());
    }

    @Override
    public String startFly(String model) {
        String result ="";
        AirPlane plane = getFighter(model);
        boolean isFlying = IsStartFly(plane);
        result = this.printIsFlying.print(isFlying, plane);
        return result;
    }

    @Override
    public String loadAirforce(String weaponName, int count, String airPlaneName) {
        AirPlane fighter = this.choicePlane.getAirplane(this.player, airPlaneName);
        List<Weapon> weapons = this.getWeapons.setWeapon(weaponName, count, this.arsenal);
        this.payWeapons.payWeapon(this.player, weapons);
        fighter.setWeapons(weapons);
        String result = String.format(Constant.AIRPLANE_IS_ALREDY_LOADED,
                airPlaneName, count, weaponName);
        return result;
    }

    @Override
    public String fineAnyEnemy(Enemy target) {
        this.enemies.add(target);
        String result = "You have target";
        return result;
    }

    @Override
    public String flyReport() {
        List<AirPlane> planes = this.selectAirplanesIsFly.getAirPlanesWhoIsFly(this.player);
        String result = this.printFlyReport.result(planes);
        return result;
    }

    @Override
    public String shootTarget(String planeName) {
        String result = "";
        AirPlane plane = getFighter(planeName);
        Enemy target = this.enemies.stream()
                .findFirst()
                .orElse(null);
        if (plane != null && plane.isFly() && plane.getSizeWeapons() > 0) {
            plane.setTarget(target);
            result = this.killTheEnemy.shoot(this.enemies, plane, target);
        } else {
            result = "Yor plane is not fly or not armed!";
        }
        return result;
    }

    @Override
    public String getChopper(Chopper chopper) {
        this.player.addChopper(chopper);
        return String.format("You added %s chopper!",chopper.getModel());
    }

    private AirPlane getFighter(String planeName) {
        return this.player.getAirplane(planeName);
    }

    private boolean IsStartFly(AirPlane plane) {
        return this.isFly.isFly(plane);
    }


}
