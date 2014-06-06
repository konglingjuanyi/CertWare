/**
 */
package stateAnalysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateAnalysis.Device;
import stateAnalysis.DeviceCommand;
import stateAnalysis.DeviceMeasurement;
import stateAnalysis.StateAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stateAnalysis.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.impl.DeviceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.impl.DeviceImpl#getDeviceCommands <em>Device Commands</em>}</li>
 *   <li>{@link stateAnalysis.impl.DeviceImpl#getDeviceMeasurements <em>Device Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends EObjectImpl implements Device
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeviceCommands() <em>Device Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceCommands()
   * @generated
   * @ordered
   */
  protected EList<DeviceCommand> deviceCommands;

  /**
   * The cached value of the '{@link #getDeviceMeasurements() <em>Device Measurements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceMeasurements()
   * @generated
   * @ordered
   */
  protected EList<DeviceMeasurement> deviceMeasurements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateAnalysisPackage.Literals.DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceCommand> getDeviceCommands()
  {
    if (deviceCommands == null)
    {
      deviceCommands = new EObjectContainmentEList<DeviceCommand>(DeviceCommand.class, this, StateAnalysisPackage.DEVICE__DEVICE_COMMANDS);
    }
    return deviceCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceMeasurement> getDeviceMeasurements()
  {
    if (deviceMeasurements == null)
    {
      deviceMeasurements = new EObjectContainmentEList<DeviceMeasurement>(DeviceMeasurement.class, this, StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS);
    }
    return deviceMeasurements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE__DEVICE_COMMANDS:
        return ((InternalEList<?>)getDeviceCommands()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS:
        return ((InternalEList<?>)getDeviceMeasurements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE__NAME:
        return getName();
      case StateAnalysisPackage.DEVICE__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.DEVICE__DEVICE_COMMANDS:
        return getDeviceCommands();
      case StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS:
        return getDeviceMeasurements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.DEVICE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.DEVICE__DEVICE_COMMANDS:
        getDeviceCommands().clear();
        getDeviceCommands().addAll((Collection<? extends DeviceCommand>)newValue);
        return;
      case StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS:
        getDeviceMeasurements().clear();
        getDeviceMeasurements().addAll((Collection<? extends DeviceMeasurement>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.DEVICE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.DEVICE__DEVICE_COMMANDS:
        getDeviceCommands().clear();
        return;
      case StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS:
        getDeviceMeasurements().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.DEVICE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.DEVICE__DEVICE_COMMANDS:
        return deviceCommands != null && !deviceCommands.isEmpty();
      case StateAnalysisPackage.DEVICE__DEVICE_MEASUREMENTS:
        return deviceMeasurements != null && !deviceMeasurements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
