import com.baidu.bailing.lib.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ${CLASS}Enum implements BaseEnum {

    ;
    private long code;
    private String desc;

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public boolean isDefaultOne() {
        return false;
    }

    /**
     * 通过code获取枚举值
     *
     * @param code 编码
     * @return 对应的枚举值，如果不存在返回null
     */
    public static ${CLASS}Enum getByCode(long code) {
        for (${CLASS}Enum value : ${CLASS}Enum.values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }

    /**
     * 通过Integer类型的code获取枚举值
     *
     * @param code 编码
     * @return 对应的枚举值，如果不存在或code为null返回null
     */
    public static ${CLASS}Enum getByCode(Integer code) {
        return code == null ? null : getByCode(code.longValue());
    }

    /**
     * 通过描述获取枚举值
     *
     * @param desc 描述
     * @return 对应的枚举值，如果不存在或desc为null返回null
     */
    public static ${CLASS}Enum getByDesc(String desc) {
        if (desc == null) {
            return null;
        }
        for (${CLASS}Enum value : ${CLASS}Enum.values()) {
            if (desc.equals(value.desc)) {
                return value;
            }
        }
        return null;
    }

    /**
     * 判断给定的code是否存在于枚举中
     *
     * @param code 待检查的code
     * @return 是否存在
     */
    public static boolean contains(long code) {
        return getByCode(code) != null;
    }

    /**
     * 判断给定的desc是否存在于枚举中
     *
     * @param desc 待检查的描述
     * @return 是否存在
     */
    public static boolean containsDesc(String desc) {
        return getByDesc(desc) != null;
    }

}