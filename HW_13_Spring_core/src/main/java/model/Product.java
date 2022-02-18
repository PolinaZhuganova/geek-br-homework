package model;


/**
 * Класс model.Product
 */
public class Product {

	private int id;
	private String title;
	private int cost;

	public Product(int id, String title, int cost) {
		this.id = id;
		this.title = title;
		this.cost = cost;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Устанавливает
	 *
	 * @param AbstractElement{name='id', isArray=false, isPrimitiveArray=false, isObjectArray=false, isStringArray=false, isCollection=false, isMap=false, isSet=false, isList=false, isPrimitive=true, isString=false, isNumeric=true, isObject=false, isDate=false, isCalendar=false, isBoolean=false, isLong=false, isFloat=false, isDouble=false, isVoid=false, isChar=false, isByte=false, isShort=false, typeName='null', type='int', typeQualifiedName='null', isModifierStatic=false, isModifierPublic=false, isModifierProtected=false, isModifierPackageLocal=false, isModifierPrivate=true, isModifierFinal=false} ::: FieldElement{isConstant=false, isEnum=false, isModifierTransient=false, isModifierVolatile=false}
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Устанавливает
	 *
	 * @param AbstractElement{name='title', isArray=false, isPrimitiveArray=false, isObjectArray=false, isStringArray=false, isCollection=false, isMap=false, isSet=false, isList=false, isPrimitive=false, isString=true, isNumeric=false, isObject=true, isDate=false, isCalendar=false, isBoolean=false, isLong=false, isFloat=false, isDouble=false, isVoid=false, isChar=false, isByte=false, isShort=false, typeName='String', type='java.lang.String', typeQualifiedName='java.lang.String', isModifierStatic=false, isModifierPublic=false, isModifierProtected=false, isModifierPackageLocal=false, isModifierPrivate=true, isModifierFinal=false} ::: FieldElement{isConstant=false, isEnum=false, isModifierTransient=false, isModifierVolatile=false}
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * Устанавливает
	 *
	 * @param AbstractElement{name='cost', isArray=false, isPrimitiveArray=false, isObjectArray=false, isStringArray=false, isCollection=false, isMap=false, isSet=false, isList=false, isPrimitive=true, isString=false, isNumeric=true, isObject=false, isDate=false, isCalendar=false, isBoolean=false, isLong=false, isFloat=false, isDouble=false, isVoid=false, isChar=false, isByte=false, isShort=false, typeName='null', type='int', typeQualifiedName='null', isModifierStatic=false, isModifierPublic=false, isModifierProtected=false, isModifierPackageLocal=false, isModifierPrivate=true, isModifierFinal=false} ::: FieldElement{isConstant=false, isEnum=false, isModifierTransient=false, isModifierVolatile=false}
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
}