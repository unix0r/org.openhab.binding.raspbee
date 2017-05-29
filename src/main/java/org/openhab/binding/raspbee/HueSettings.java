
public class HueSettings {

    import java.io.IOException;
    import java.util.Map;
    import java.util.Set;

    import org.codehaus.jackson.JsonNode;
    import org.codehaus.jackson.map.ObjectMapper;
    import org.openhab.binding.hue.internal.hardware.HueBulb;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    
    
    //hier werden die Einstellugnen gesetzt und geprüft
    
    
    
    private SettingsTree settingsData = null;

    public HueSettings(String settings) {

//        ObjectMapper mapper = new ObjectMapper();
        try {
//            JsonNode rootNode = mapper.readTree(settings);
//            if (!isAuthorizationError(rootNode)) {
                    //new settings
//            }   
        } catch (IOException e) {
            
        }
    }

    private boolean isAuthorizationError(JsonNode rootNode) {

        //if (){
        // 
        //return true;
        //}
        
        return false;
    }

    public boolean isValidId(String deviceId) {
        //if (){
        // 
        //return true;
        //}
        
        return false;

    }
    
    public String getModelId(String deviceId) {
        
        return 0;
    }
    
    public int getColorTemperature(String deviceId) {

    }
    
}