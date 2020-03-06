package poc.graphql.graphql.dao;



import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.time.LocalDate;


@Data
@EqualsAndHashCode
@Entity
public class Vehicle {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type", nullable = false)
    private String type;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "model_code", nullable = false)
    private String modelCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    private LocalDate launchDate;
    private transient  String formattedDate;



}

