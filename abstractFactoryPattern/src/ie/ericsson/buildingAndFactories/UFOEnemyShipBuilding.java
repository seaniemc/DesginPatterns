package ie.ericsson.buildingAndFactories;

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

import ie.ericsson.ships.EnemyShip;
import ie.ericsson.ships.UFOBossEnemyShip;
import ie.ericsson.ships.UFOEnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of parts and engines a regular UFO
        // needs. The EnemyShip object is returned & given a name
        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else
        // If UFO BOSS was sent grab use the factory that knows
        // what types of parts and engines a Boss.
        // needs. The EnemyShip object is returned & given a name
        if(typeOfShip.equals("UFO BOSS")){
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
        }
        return theEnemyShip;
    }

}

