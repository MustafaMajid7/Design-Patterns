package DesginPatterns.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteControl implements Control{

    private List<Device> list = new ArrayList<>();
    private Map<String,Integer> mapOfDevices = new HashMap<>();
    private String lastdevice;

    public void control(String deviceName){
        if (list.size() !=0 && mapOfDevices.containsKey(deviceName)) {
            System.out.println(list.get(mapOfDevices.get(deviceName)).excute());
            lastdevice = deviceName;
        }
        else
            System.out.println(deviceName + " isn't installed yet");
    }

    public void setdevice(String name, Device device) {
        if (!mapOfDevices.containsKey(name)){
            mapOfDevices.put(name,list.size());
            list.add(device);
            System.out.println("the device is added successfully");
        }
        else
            System.out.println("this device is already existed");
    }

    public void UnDo(){
        System.out.println(list.get(mapOfDevices.get(lastdevice)).excute());
    }
}
