/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation.impl;

import de.cau.cs.se.instrumentation.language.instrumentation.CodeElement;
import de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage;
import de.cau.cs.se.instrumentation.language.instrumentation.SimpleCodeElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl#isToUpper <em>To Upper</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeElementImpl extends MinimalEObjectImpl.Container implements CodeElement
{
  /**
   * The default value of the '{@link #isToUpper() <em>To Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToUpper()
   * @generated
   * @ordered
   */
  protected static final boolean TO_UPPER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToUpper() <em>To Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToUpper()
   * @generated
   * @ordered
   */
  protected boolean toUpper = TO_UPPER_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SimpleCodeElement value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CodeElementImpl()
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
    return InstrumentationPackage.Literals.CODE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToUpper()
  {
    return toUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToUpper(boolean newToUpper)
  {
    boolean oldToUpper = toUpper;
    toUpper = newToUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstrumentationPackage.CODE_ELEMENT__TO_UPPER, oldToUpper, toUpper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleCodeElement getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(SimpleCodeElement newValue, NotificationChain msgs)
  {
    SimpleCodeElement oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrumentationPackage.CODE_ELEMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SimpleCodeElement newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrumentationPackage.CODE_ELEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrumentationPackage.CODE_ELEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstrumentationPackage.CODE_ELEMENT__VALUE, newValue, newValue));
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
      case InstrumentationPackage.CODE_ELEMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case InstrumentationPackage.CODE_ELEMENT__TO_UPPER:
        return isToUpper();
      case InstrumentationPackage.CODE_ELEMENT__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InstrumentationPackage.CODE_ELEMENT__TO_UPPER:
        setToUpper((Boolean)newValue);
        return;
      case InstrumentationPackage.CODE_ELEMENT__VALUE:
        setValue((SimpleCodeElement)newValue);
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
      case InstrumentationPackage.CODE_ELEMENT__TO_UPPER:
        setToUpper(TO_UPPER_EDEFAULT);
        return;
      case InstrumentationPackage.CODE_ELEMENT__VALUE:
        setValue((SimpleCodeElement)null);
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
      case InstrumentationPackage.CODE_ELEMENT__TO_UPPER:
        return toUpper != TO_UPPER_EDEFAULT;
      case InstrumentationPackage.CODE_ELEMENT__VALUE:
        return value != null;
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
    result.append(" (toUpper: ");
    result.append(toUpper);
    result.append(')');
    return result.toString();
  }

} //CodeElementImpl
