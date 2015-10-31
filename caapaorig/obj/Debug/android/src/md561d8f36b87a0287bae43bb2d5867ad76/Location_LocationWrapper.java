package md561d8f36b87a0287bae43bb2d5867ad76;


public class Location_LocationWrapper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("caapaorig.Items.Location/LocationWrapper, caapa, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Location_LocationWrapper.class, __md_methods);
	}


	public Location_LocationWrapper () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Location_LocationWrapper.class)
			mono.android.TypeManager.Activate ("caapaorig.Items.Location/LocationWrapper, caapa, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
