/**
 */
package .impl;

import .Activity;
import .Connection;
import .Template;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link .impl.ConnectionImpl#getTemplateConnection <em>Template Connection</em>}</li>
 *   <li>{@link .impl.ConnectionImpl#getActivityConnection <em>Activity Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getTemplateConnection() <em>Template Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateConnection()
	 * @generated
	 * @ordered
	 */
	protected Template templateConnection;

	/**
	 * The cached value of the '{@link #getActivityConnection() <em>Activity Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityConnection()
	 * @generated
	 * @ordered
	 */
	protected Activity activityConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return .Package.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplateConnection() {
		if (templateConnection != null && templateConnection.eIsProxy()) {
			InternalEObject oldTemplateConnection = (InternalEObject)templateConnection;
			templateConnection = (Template)eResolveProxy(oldTemplateConnection);
			if (templateConnection != oldTemplateConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, .Package.CONNECTION__TEMPLATE_CONNECTION, oldTemplateConnection, templateConnection));
			}
		}
		return templateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetTemplateConnection() {
		return templateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateConnection(Template newTemplateConnection) {
		Template oldTemplateConnection = templateConnection;
		templateConnection = newTemplateConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, .Package.CONNECTION__TEMPLATE_CONNECTION, oldTemplateConnection, templateConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityConnection() {
		if (activityConnection != null && activityConnection.eIsProxy()) {
			InternalEObject oldActivityConnection = (InternalEObject)activityConnection;
			activityConnection = (Activity)eResolveProxy(oldActivityConnection);
			if (activityConnection != oldActivityConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, .Package.CONNECTION__ACTIVITY_CONNECTION, oldActivityConnection, activityConnection));
			}
		}
		return activityConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivityConnection() {
		return activityConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityConnection(Activity newActivityConnection) {
		Activity oldActivityConnection = activityConnection;
		activityConnection = newActivityConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, .Package.CONNECTION__ACTIVITY_CONNECTION, oldActivityConnection, activityConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case .Package.CONNECTION__TEMPLATE_CONNECTION:
				if (resolve) return getTemplateConnection();
				return basicGetTemplateConnection();
			case .Package.CONNECTION__ACTIVITY_CONNECTION:
				if (resolve) return getActivityConnection();
				return basicGetActivityConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case .Package.CONNECTION__TEMPLATE_CONNECTION:
				setTemplateConnection((Template)newValue);
				return;
			case .Package.CONNECTION__ACTIVITY_CONNECTION:
				setActivityConnection((Activity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case .Package.CONNECTION__TEMPLATE_CONNECTION:
				setTemplateConnection((Template)null);
				return;
			case .Package.CONNECTION__ACTIVITY_CONNECTION:
				setActivityConnection((Activity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case .Package.CONNECTION__TEMPLATE_CONNECTION:
				return templateConnection != null;
			case .Package.CONNECTION__ACTIVITY_CONNECTION:
				return activityConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
