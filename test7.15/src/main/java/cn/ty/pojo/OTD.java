package cn.ty.pojo;

/**
 * @author Remy~
 * @date 来自:2021年07月15日 17:12
 */
public class OTD {
    private Integer cid;

    private String cname;

    private Double price;

    private String img;

    private Integer tid;

    private String type;

    @Override
    public String toString() {
        return "OTD{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", tid=" + tid +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
