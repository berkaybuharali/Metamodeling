/**
 */
package ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link .Connection#getTemplateConnection <em>Template Connection</em>}</li>
 *   <li>{@link .Connection#getActivityConnection <em>Activity Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see .Package#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Connection</em>' reference.
	 * @see #setTemplateConnection(Template)
	 * @see .Package#getConnection_TemplateConnection()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplateConnection();

	/**
	 * Sets the value of the '{@link .Connection#getTemplateConnection <em>Template Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Connection</em>' reference.
	 * @see #getTemplateConnection()
	 * @generated
	 */
	void setTemplateConnection(Template value);

	/**
	 * Returns the value of the '<em><b>Activity Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Connection</em>' reference.
	 * @see #setActivityConnection(Activity)
	 * @see .Package#getConnection_ActivityConnection()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivityConnection();

	/**
	 * Sets the value of the '{@link .Connection#getActivityConnection <em>Activity Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Connection</em>' reference.
	 * @see #getActivityConnection()
	 * @generated
	 */
	void setActivityConnection(Activity value);

} // Connection
