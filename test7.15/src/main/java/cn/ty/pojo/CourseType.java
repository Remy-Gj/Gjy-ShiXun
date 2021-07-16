package cn.ty.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_coursetype")
public class CourseType implements Serializable {
    @Id
    private Integer tid;

    private String type;

    private static final long serialVersionUID = 1L;

    /**
     * @return tid
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * @param tid
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}