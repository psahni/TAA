public interface Switch {
    boolean isOn();
    void press();
}


public interface Switchable {
    void turnOn();
    void turnOff();
}



   //package guru.springframework.blog.dependencyinversionprinciple.highlevel;
public class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean on;
    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }
    
	public boolean isOn() {
        return this.on;
    }
   
	public void press() {
       boolean checkOn = isOn();
       
		if (checkOn) {
		  client.turnOff();
		  this.on = false;
		} else {
		  client.turnOn();
		  this.on = true;
		}
   }
}


//---


import guru.springframework.blog.dependencyinversionprinciple.highlevel.Switchable;
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}


//---

import guru.springframework.blog.dependencyinversionprinciple.highlevel.Switchable;
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}


//---


   //package guru.springframework.blog.dependencyinversionprinciple.highlevel;
   
import guru.springframework.blog.dependencyinversionprinciple.lowlevel.Fan;
import guru.springframework.blog.dependencyinversionprinciple.lowlevel.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {
    @Test
    public void testPress() throws Exception {
      Switchable switchableBulb = new LightBulb();
      Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
      
	  bulbPowerSwitch.press();
      bulbPowerSwitch.press();
      
	  Switchable switchableFan = new Fan();
      Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
      
	  fanPowerSwitch.press();
      fanPowerSwitch.press();
    }
}