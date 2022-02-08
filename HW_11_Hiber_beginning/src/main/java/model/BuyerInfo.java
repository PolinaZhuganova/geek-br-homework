package model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Класс BuyerInfo
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "buyerInfo")

public class BuyerInfo {

	public BuyerInfo(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "id")
		private long id;

		@Column(name = "name")
		private String name;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "buyerInfo")
@Cascade(org.hibernate.annotations.CascadeType.ALL)
private List<BuyerGood> buyerGoods;


	@Override
	public String toString() {
		return "BuyerInfo{" +
			"name='" + name + '\'' +
			'}';
	}
}