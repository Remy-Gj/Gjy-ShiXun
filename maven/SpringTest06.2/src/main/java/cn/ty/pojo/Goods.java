package cn.ty.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_goods")
public class Goods implements Serializable {
    @Id
    private Integer gid;

    private String gname;

    private Double price;

    private Date createtime;

    private String items;

    private static final long serialVersionUID = 1L;

    /**
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * @param gid
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * @return gname
     */
    public String getGname() {
        return gname;
    }

    /**
     * @param gname
     */
    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return items
     */
    public String getItems() {
        return items;
    }

    /**
     * @param items
     */
    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", gname=").append(gname);
        sb.append(", price=").append(price);
        sb.append(", createtime=").append(createtime);
        sb.append(", items=").append(items);
        sb.append("]");
        return sb.toString();
    }
}