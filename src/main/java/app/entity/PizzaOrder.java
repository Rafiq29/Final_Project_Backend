package app.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "pizzaOrder")
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pOrderID;

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Delivery surname is required")
    private String deliverySurname;

    @ManyToMany(targetEntity = InCard.class,cascade = CascadeType.ALL)
    @JoinColumn(name="pizzaOrder")
    private List<InCard> pOrderInCardList;

    @NotBlank(message = "Status is required")
    private String pOrderStatus;

    @NotBlank(message = "Date is required")
    private String pOrderDate;

    private String pOrderAddress;

    private String pOrderPhone;

    private String pOrderEmail;

    private double allPrice;
}
