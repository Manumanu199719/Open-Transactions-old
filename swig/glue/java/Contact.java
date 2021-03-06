/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class Contact extends Displayable {
  private long swigCPtr;

  protected Contact(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.Contact_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Contact obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Contact(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:swig\otapi\OTAPI.i,151,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private AddressBook containerRefAddressBook;
	// ----------------	
	protected void addReference(AddressBook theContainer) {  // This is Java code
		containerRefAddressBook = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
	/*@SWIG:swig\otapi\OTAPI.i,105,OT_CONTAINER_TYPE_MEMBERS@*/
	private List elementList = new ArrayList();
/*@SWIG@*/
	/*@SWIG:swig\otapi\OTAPI.i,182,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefContactNym(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	ContactNym refActualElement = GetContactNym(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof ContactNym))
			continue;

		ContactNym tempRef = (ContactNym)(theObject);
		
		if ((ContactNym.getCPtr(tempRef) == ContactNym.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefContactNym(ContactNym element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof ContactNym))
			continue;
		
		ContactNym tempRef = (ContactNym)(theObject);
		
		if ((ContactNym.getCPtr(tempRef) == ContactNym.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	ContactNym tempLocalRef = element;
	elementList.add(tempLocalRef);
	return ContactNym.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
	/*@SWIG:swig\otapi\OTAPI.i,182,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefContactAcct(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	ContactAcct refActualElement = GetContactAcct(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof ContactAcct))
			continue;

		ContactAcct tempRef = (ContactAcct)(theObject);
		
		if ((ContactAcct.getCPtr(tempRef) == ContactAcct.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefContactAcct(ContactAcct element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof ContactAcct))
			continue;
		
		ContactAcct tempRef = (ContactAcct)(theObject);
		
		if ((ContactAcct.getCPtr(tempRef) == ContactAcct.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	ContactAcct tempLocalRef = element;
	elementList.add(tempLocalRef);
	return ContactAcct.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
  public void setGui_label(String value) {
    otapiJNI.Contact_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.Contact_gui_label_get(swigCPtr, this);
  }

  public void setContact_id(String value) {
    otapiJNI.Contact_contact_id_set(swigCPtr, this, value);
  }

  public String getContact_id() {
    return otapiJNI.Contact_contact_id_get(swigCPtr, this);
  }

  public void setEmail(String value) {
    otapiJNI.Contact_email_set(swigCPtr, this, value);
  }

  public String getEmail() {
    return otapiJNI.Contact_email_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    otapiJNI.Contact_memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return otapiJNI.Contact_memo_get(swigCPtr, this);
  }

  public void setPublic_key(String value) {
    otapiJNI.Contact_public_key_set(swigCPtr, this, value);
  }

  public String getPublic_key() {
    return otapiJNI.Contact_public_key_get(swigCPtr, this);
  }

  public long GetContactNymCount() {
    return otapiJNI.Contact_GetContactNymCount(swigCPtr, this);
  }

  public ContactNym GetContactNym(long nIndex) {
    long cPtr = otapiJNI.Contact_GetContactNym(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new ContactNym(cPtr, false);
  }

  public boolean RemoveContactNym(long nIndexContactNym) {
    return otapiJNI.Contact_RemoveContactNym(swigCPtr, this, removeRefContactNym(nIndexContactNym));
  }

  public boolean AddContactNym(ContactNym disownObject) {
    return otapiJNI.Contact_AddContactNym(swigCPtr, this, ContactNym.getCPtr(disownObject), disownObject);
  }

  public long GetContactAcctCount() {
    return otapiJNI.Contact_GetContactAcctCount(swigCPtr, this);
  }

  public ContactAcct GetContactAcct(long nIndex) {
    long cPtr = otapiJNI.Contact_GetContactAcct(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new ContactAcct(cPtr, false);
  }

  public boolean RemoveContactAcct(long nIndexContactAcct) {
    return otapiJNI.Contact_RemoveContactAcct(swigCPtr, this, removeRefContactAcct(nIndexContactAcct));
  }

  public boolean AddContactAcct(ContactAcct disownObject) {
    return otapiJNI.Contact_AddContactAcct(swigCPtr, this, ContactAcct.getCPtr(disownObject), disownObject);
  }

  public static Contact ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.Contact_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new Contact(cPtr, false);
  }

}
