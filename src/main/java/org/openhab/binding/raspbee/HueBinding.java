import org.osgi.service.cm.ManagedService;

public class HueBinding extends AbstractActiveBinding<HueBindingProvider>implements ManagedService {

    public HueBinding() {
    }

    @Override
    public void execute() {

        // Änderungen an der Lampe werden überprüft und ggf. geändert
        //für jedes Gerät

//        for (HueBindingProvider provider : this.providers) {
//            for (String hueItemName : provider.getInBindingItemNames()) {
//                HueBindingConfig deviceConfig = getConfigForItemName(hueItemName);
//                if (deviceConfig != null) {
//                    HueBulb bulb = bulbCache.get(deviceConfig.getDeviceId());
//                    if (bulb != null) {

                        // Licht an/aus
                        /*
                         * if ((bulb.getIsOn() == true) && (bulb.getIsReachable() == true)) {
                         * if ((deviceConfig.itemStateOnOffType == null) /// an/aus
                         * || (deviceConfig.itemStateOnOffType.equals(OnOffType.ON) == false)) {
                         * eventPublisher.postUpdate(hueItemName, OnOffType.ON);
                         * deviceConfig.itemStateOnOffType = OnOffType.ON;
                         * }
                         * } else {
                         * if ((deviceConfig.itemStateOnOffType == null)
                         * || (deviceConfig.itemStateOnOffType.equals(OnOffType.OFF) == false)) {
                         * eventPublisher.postUpdate(hueItemName, OnOffType.OFF);
                         * deviceConfig.itemStateOnOffType = OnOffType.OFF;
                         * }
                         * }
                         */

                        // Helligkeit Änderung
                        /*
                         * if (deviceConfig.getType().equals(BindingType.brightness)) {
                         * if ((bulb.getIsOn() == true) && (bulb.getIsReachable() == true)) {
                         * // Only postUpdate when bulb is on, otherwise dimmer item is not retaining state and
                         * // shows to max brightness value
                         * PercentType newPercent = new PercentType((int) Math
                         * .round((bulb.getBrightness() * (double) 100) / HueBulb.MAX_BRIGHTNESS));
                         * if ((deviceConfig.itemStatePercentType == null)
                         * || (deviceConfig.itemStatePercentType.equals(newPercent) == false)) {
                         * eventPublisher.postUpdate(hueItemName, newPercent);
                         * deviceConfig.itemStatePercentType = newPercent;
                         * }
                         * }
                         */

                        // Farbe Änderung
                        /*
                         * } else if (deviceConfig.getType().equals(BindingType.rgb)) {
                         * if ((bulb.getIsOn() == true) && (bulb.getIsReachable() == true)) {
                         * // Only postUpdate when bulb is on, otherwise color item is not retaining
                         * // state and
                         * // shows to max brightness value
                         * 
                         * DecimalType decimalHue = new DecimalType(bulb.getHue() / (double) 182);
                         * PercentType percentBrightness = new PercentType((int) Math
                         * .round((bulb.getBrightness() * (double) 100) / HueBulb.MAX_BRIGHTNESS));
                         * PercentType percentSaturation = new PercentType((int) Math
                         * .round((bulb.getSaturation() * (double) 100) / HueBulb.MAX_SATURATION));
                         * HSBType newHsb = new HSBType(decimalHue, percentSaturation, percentBrightness);
                         * 
                         * if ((deviceConfig.itemStateHSBType == null)
                         * || (deviceConfig.itemStateHSBType.equals(newHsb) == false)) {
                         * eventPublisher.postUpdate(hueItemName, newHsb);
                         * deviceConfig.itemStateHSBType = newHsb;
                         * }
                         * }
                         * }
                         */
//                    }
//                }
//            }
//        }
    }
    
    @Override
    public void internalReceiveCommand(String itemName, Command command) {
        super.internalReceiveCommand(itemName, command);

//        if (BridgeAktiv != null) {
//            computeCommandForItemOnBridge(command, itemName, activeBridge);
//        } 
    }
    
    /**
     * Checks whether the command is for one of the configured Hue bulbs. If
     * this is the case, the command is translated to the corresponding action
     * which is then sent to the given bulb.
     *
     * @param command
     *            The command from the openHAB bus.
     * @param itemName
     *            The name of the targeted item.
     * @param bridge
     *            The Hue bridge the Hue bulb is connected to
     */
    private void computeCommandForItemOnBridge(Command command, String itemName, HueBridge bridge) {
//        HueBindingConfig deviceConfig = getConfigForItemName(itemName);
//
//        if (deviceConfig == null) {
//            return;
//        }
//
//        HueBulb bulb = bulbCache.get(deviceConfig.getDeviceId());
//        if (bulb == null) {
//            bulb = new HueBulb(bridge, deviceConfig.getDeviceId());
//            bulbCache.put(deviceConfig.getDeviceId(), bulb);
//        }
//
//        if (command instanceof OnOffType) {
//            bulb.switchOn(OnOffType.ON.equals(command));
//        }
//
//        if (command instanceof HSBType) {
//            HSBType hsbCommand = (HSBType) command;
//            DecimalType hue = hsbCommand.getHue();
//            PercentType sat = hsbCommand.getSaturation();
//            PercentType bri = hsbCommand.getBrightness();
//            bulb.colorizeByHSB(hue.doubleValue() / 360, sat.doubleValue() / 100, bri.doubleValue() / 100);
//        }
//
//        if (deviceConfig.getType().equals(BindingType.brightness) || deviceConfig.getType().equals(BindingType.rgb)) {
//            if (IncreaseDecreaseType.INCREASE.equals(command)) {
//                int resultingValue = bulb.increaseBrightness(deviceConfig.getStepSize());
//                eventPublisher.postUpdate(itemName, new PercentType(resultingValue));
//            } else if (IncreaseDecreaseType.DECREASE.equals(command)) {
//                int resultingValue = bulb.decreaseBrightness(deviceConfig.getStepSize());
//                eventPublisher.postUpdate(itemName, new PercentType(resultingValue));
//            } else if ((command instanceof PercentType) && !(command instanceof HSBType)) {
//                bulb.setBrightness((int) Math
//                        .round((double) HueBulb.MAX_BRIGHTNESS / (double) 100 * ((PercentType) command).intValue()));
//            }
//        }
//
//        if (deviceConfig.getType().equals(BindingType.colorTemperature)) {
//            if (IncreaseDecreaseType.INCREASE.equals(command)) {
//                bulb.increaseColorTemperature(deviceConfig.getStepSize());
//            } else if (IncreaseDecreaseType.DECREASE.equals(command)) {
//                bulb.decreaseColorTemperature(deviceConfig.getStepSize());
//            } else if (command instanceof PercentType) {
//                bulb.setColorTemperature(
//                        (int) Math.round((((double) 346 / (double) 100) * ((PercentType) command).intValue()) + 154));
//            }
//        }
    }
  
    
//gibt die Config zurück
    private HueBindingConfig getConfigForItemName(String itemName) {
//        for (HueBindingProvider provider : this.providers) {
//            if (provider.getItemConfig(itemName) != null) {
//                return provider.getItemConfig(itemName);
//            }
//        }
        return null;
    }

}
