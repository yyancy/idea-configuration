#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end

import com.baidu.bailing.lib.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

#parse("File Header.java")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ${NAME}Enum implements BaseEnum {
   
   ;

    private Integer code;
    private String desc;

    @Override
    public long getCode() {
        return code;
    }

    public int getIntCode() {
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

    public static ${NAME}Enum getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (${NAME}Enum value : ${NAME}Enum.values()) {
            if (value.getCode() == code.longValue()) {
                return value;
            }
        }
        return null;
    }

    public static ${NAME}Enum getByDesc(String desc) {
        if (desc == null) {
            return null;
        }
        for (${NAME}Enum value : ${NAME}Enum.values()) {
            if (value.getDesc().equals(desc)) {
                return value;
            }
        }
        return null;
    }
}
