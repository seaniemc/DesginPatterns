package ie.ericsson.buildingAndFactories;

// With an Abstract Factory Pattern you won't
// just build ships, but also all of the components
// for the ships
// Here is where you define the parts that are required
// if an object wants to be an enemy ship

import ie.ericsson.parts.ESEngine;
import ie.ericsson.parts.ESWeapon;

public interface EnemyShipFactory {
    public ESWeapon addESGun();
    public ESEngine addESEngine();

}
