package DesginPatterns.composite;

import java.util.List;

public interface Component {

    double showPrice();
    String showDesc();
    default void addDevice(List<Component> sd){}

}
//                                       example on hierarchy of composite pattern
//
//    Component PC = new CompositeComponent("Personal Computer");
//    Component Peripherals = new CompositeComponent("peripherals");
//    Component Cabinat = new CompositeComponent("Cabinat");
//    Component MotherBoard = new CompositeComponent("MotherBoard");
//    Component Media = new CompositeComponent("Media");
//    Component StorageMedia = new CompositeComponent("StorageMedia");
//    Component SoundMedia = new CompositeComponent("SoundMedia");
//
//    Component mouse = new SimpleDevice("Mouse",2.5);
//    Component keyboard = new SimpleDevice("Keyboard",4.0);
//    Component speaker = new SimpleDevice("Speaker",5);
//    Component hdd = new SimpleDevice("HDD",8);
//    Component ssd = new SimpleDevice("SSD",12);
//    Component ram = new SimpleDevice("RAM",6);
//    Component cpu = new SimpleDevice("CPU",15);
//    Component gpu = new SimpleDevice("GPU",25);
//
//        PC.addDevice(Arrays.asList(Peripherals,Cabinat));
//                Peripherals.addDevice(Arrays.asList(mouse,keyboard));
//                Cabinat.addDevice(Arrays.asList(MotherBoard,Media));
//                MotherBoard.addDevice(Arrays.asList(ram,cpu,gpu));
//                Media.addDevice(Arrays.asList(StorageMedia,SoundMedia));
//                StorageMedia.addDevice(Arrays.asList(hdd,ssd));
//                SoundMedia.addDevice(Arrays.asList(speaker));
//
//                System.out.println(PC.showDesc());

