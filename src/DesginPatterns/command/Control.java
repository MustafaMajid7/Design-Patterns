package DesginPatterns.command;

public interface Control {

    void control(String deviceName);
    void setdevice(String name,Device device);
    void UnDo();

}
//
//    Control control = new RemoteControl();
//
//    Device d1 = new Light("balcony");
//    Device d2 = new Light("entrance");
//    Device d3 = new Fan("kitchen");
//    Device d4 = new Light("bathroom");
//    Device d5 = new Light("corridor");
//    Device d6 = new Fan("living room");
//
//        control.setdevice(d1.getName(),d1);
//                control.setdevice(d2.getName(),d2);
//                control.setdevice(d3.getName(),d3);
//                control.setdevice(d4.getName(),d4);
//                control.setdevice(d5.getName(),d5);
//                control.setdevice(d6.getName(),d6);
//
//                control.control("balcony");
//                control.control("kitchen");
//                control.control("hello");
//                control.UnDo();
