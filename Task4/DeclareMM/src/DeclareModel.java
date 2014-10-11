/**
 */
package ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link .DeclareModel#getName <em>Name</em>}</li>
 *   <li>{@link .DeclareModel#getContainsActivity <em>Contains Activity</em>}</li>
 *   <li>{@link .DeclareModel#getContainsTemplate <em>Contains Template</em>}</li>
 *   <li>{@link .DeclareModel#getContainsConnection <em>Contains Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see .Package#getDeclareModel()
 * @model
 * @generated
 */
public interface DeclareModel extends EObject {
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
	 * @see .Package#getDeclareModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link .DeclareModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Activity</b></em>' containment reference list.
	 * The list contents are of type {@link .Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Activity</em>' containment reference list.
	 * @see .Package#getDeclareModel_ContainsActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getContainsActivity();

	/**
	 * Returns the value of the '<em><b>Contains Template</b></em>' containment reference list.
	 * The list contents are of type {@link .Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Template</em>' containment reference list.
	 * @see .Package#getDeclareModel_ContainsTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Template> getContainsTemplate();

	/**
	 * Returns the value of the '<em><b>Contains Connection</b></em>' containment reference list.
	 * The list contents are of type {@link .Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Connection</em>' containment reference list.
	 * @see .Package#getDeclareModel_ContainsConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getContainsConnection();

} // DeclareModel
