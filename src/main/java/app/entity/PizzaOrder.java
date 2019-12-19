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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private int pOrderID;

    @ManyToMany(targetEntity = InCard.class,cascade = CascadeType.ALL)
    @JoinColumn(name="io_pk",referencedColumnName = "id")
    private List<InCard> pOrderInCardList;

    @NotBlank(message = "Status is required")
    private String pOrderStatus;

    @NotBlank(message = "Date is required")
    private String pOrderDate;

    private String pOrderAddress;

    private String pOrderPhone;

    private String pOrderEmail;
}
