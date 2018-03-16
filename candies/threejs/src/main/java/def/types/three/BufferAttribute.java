package def.types.three;
import def.js.ArrayBufferView;
import def.js.ArrayLike;
import def.js.Function;
/**
 * @see <a href="https://github.com/mrdoob/three.js/blob/master/src/core/BufferAttribute.js">src/core/BufferAttribute.js</a>
 */
public class BufferAttribute extends def.js.Object {
    public BufferAttribute(ArrayLike<Double> array, double itemSize, Boolean normalized){}
    public String uuid;
    public ArrayLike<Double> array;
    public double itemSize;
    public Boolean dynamic;
    public UpdateRange updateRange;
    public double version;
    public Boolean normalized;
    public Boolean needsUpdate;
    public double count;
    public Function onUpload;
    native public void setArray(ArrayBufferView array);
    native public BufferAttribute setDynamic(Boolean dynamic);
    @jsweet.lang.Name("clone")
    native public BufferAttribute Clone();
    native public BufferAttribute copy(BufferAttribute source);
    native public BufferAttribute copyAt(double index1, BufferAttribute attribute, double index2);
    native public BufferAttribute copyArray(ArrayLike<Double> array);
    native public BufferAttribute copyColorsArray(Colors[] colors);
    native public BufferAttribute copyIndicesArray(Indices[] indices);
    native public BufferAttribute copyVector2sArray(Vectors[] vectors);
    native public BufferAttribute copyVector3sArray(VectorsData[] vectors);
    native public BufferAttribute copyVector4sArray(VectorsDto[] vectors);
    native public BufferAttribute set(ArrayLike<Double> value, double offset);
    native public double getX(double index);
    native public BufferAttribute setX(double index, double x);
    native public double getY(double index);
    native public BufferAttribute setY(double index, double y);
    native public double getZ(double index);
    native public BufferAttribute setZ(double index, double z);
    native public double getW(double index);
    native public BufferAttribute setW(double index, double z);
    native public BufferAttribute setXY(double index, double x, double y);
    native public BufferAttribute setXYZ(double index, double x, double y, double z);
    native public BufferAttribute setXYZW(double index, double x, double y, double z, double w);
    /**
     * @deprecated Use {@link BufferAttribute#count .count} instead.
     */
    public double length;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UpdateRange extends def.js.Object {
        public double offset;
        public double count;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Colors extends def.js.Object {
        public double r;
        public double g;
        public double b;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Indices extends def.js.Object {
        public double a;
        public double b;
        public double c;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Vectors extends def.js.Object {
        public double x;
        public double y;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class VectorsData extends def.js.Object {
        public double x;
        public double y;
        public double z;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class VectorsDto extends def.js.Object {
        public double x;
        public double y;
        public double z;
        public double w;
    }
    public BufferAttribute(ArrayLike<Double> array, double itemSize){}
    native public void setArray();
    native public BufferAttribute set(ArrayLike<Double> value);
    native public BufferAttribute set(ArrayBufferView value, double offset);
    native public BufferAttribute set(ArrayBufferView value);
    public BufferAttribute(Double[] array, double itemSize, Boolean normalized){}
    native public BufferAttribute copyArray(Double[] array);
    native public BufferAttribute set(Double[] value, double offset);
    public BufferAttribute(Double[] array, double itemSize){}
    native public BufferAttribute set(Double[] value);
    native public java.lang.Object onUpload(java.lang.Object... args);
    protected BufferAttribute(){}
}

