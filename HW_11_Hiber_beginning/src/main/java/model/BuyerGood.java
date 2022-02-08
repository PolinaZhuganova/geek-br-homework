package model;


import jakarta.persistence.*;
import lombok.*;


import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Data
@Table(name = "buyerGood")

public class BuyerGood {



		@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "id")
		private long id;


	@OneToOne
	@JoinColumn(name="good_id")
	private Good good;

	@OneToOne
	@JoinColumn(name="buyer_id")
	 private BuyerInfo buyerInfo;


	public BuyerGood(Good good, BuyerInfo buyer) {
	}
}