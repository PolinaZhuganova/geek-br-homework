package model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Класс model.ItemEntity
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "items")

public class ItemEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id;

	@Column(name = "val")
	int val;

	@Version
	long version;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public int getVal() {
		return val;
	}

	/**
	 * Устанавливает
	 *
	 * @param AbstractElement{name='id', isArray=false, isPrimitiveArray=false, isObjectArray=false, isStringArray=false, isCollection=false, isMap=false, isSet=false, isList=false, isPrimitive=false, isString=false, isNumeric=true, isObject=true, isDate=false, isCalendar=false, isBoolean=false, isLong=false, isFloat=false, isDouble=false, isVoid=false, isChar=false, isByte=false, isShort=false, typeName='Long', type='java.lang.Long', typeQualifiedName='java.lang.Long', isModifierStatic=false, isModifierPublic=false, isModifierProtected=false, isModifierPackageLocal=true, isModifierPrivate=false, isModifierFinal=false} ::: FieldElement{isConstant=false, isEnum=false, isModifierTransient=false, isModifierVolatile=false}
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Устанавливает
	 *
	 * @param AbstractElement{name='val', isArray=false, isPrimitiveArray=false, isObjectArray=false, isStringArray=false, isCollection=false, isMap=false, isSet=false, isList=false, isPrimitive=true, isString=false, isNumeric=true, isObject=false, isDate=false, isCalendar=false, isBoolean=false, isLong=false, isFloat=false, isDouble=false, isVoid=false, isChar=false, isByte=false, isShort=false, typeName='null', type='int', typeQualifiedName='null', isModifierStatic=false, isModifierPublic=false, isModifierProtected=false, isModifierPackageLocal=true, isModifierPrivate=false, isModifierFinal=false} ::: FieldElement{isConstant=false, isEnum=false, isModifierTransient=false, isModifierVolatile=false}
	 */
	public void setVal(int val) {
		this.val = val;
	}
}