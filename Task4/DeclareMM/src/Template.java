/**
 */
package ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link .Template#getName <em>Name</em>}</li>
 *   <li>{@link .Template#getLtlExpression <em>Ltl Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see .Package#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see .Package#getTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link .Template#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ltl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltl Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltl Expression</em>' attribute.
	 * @see #setLtlExpression(String)
	 * @see .Package#getTemplate_LtlExpression()
	 * @model
	 * @generated
	 */
	String getLtlExpression();

	/**
	 * Sets the value of the '{@link .Template#getLtlExpression <em>Ltl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltl Expression</em>' attribute.
	 * @see #getLtlExpression()
	 * @generated
	 */
	void setLtlExpression(String value);

} // Template
