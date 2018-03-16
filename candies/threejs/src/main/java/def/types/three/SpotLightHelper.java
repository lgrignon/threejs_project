package def.types.three;
public class SpotLightHelper extends Object3D {
    public SpotLightHelper(Light light){}
    public Light light;
    native public void dispose();
    native public void update();
    protected SpotLightHelper(){}
}

