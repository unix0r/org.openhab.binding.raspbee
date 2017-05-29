import org.openhab.core.binding.BindingProvider;

public interface HueBindingProvider extends BindingProvider {

    public HueBindingConfig getItemConfig(String itemName);

    public List<String> getInBindingItemNames();
}