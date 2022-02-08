package model;

import jakarta.persistence.*;
import lombok.*;
import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Класс Goods
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "goods")

public class Good {

	public Good(long id, String type, String price) {
		this.id = id;
		this.type = type;
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private long id;


	@Column(name = "type")
	private String type;

	@Column(name = "price")
	private String price;

	@Override
	public String toString() {
		return "Goods{" +
			"type='" + type + '\'' +
			", price='" + price + '\'' +
			'}';
	}
}