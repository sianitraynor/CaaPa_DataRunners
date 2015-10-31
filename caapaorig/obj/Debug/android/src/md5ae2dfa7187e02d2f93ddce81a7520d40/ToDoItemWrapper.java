package md5ae2dfa7187e02d2f93ddce81a7520d40;


public class ToDoItemWrapper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("caapa.ToDoItemWrapper, caapa, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ToDoItemWrapper.class, __md_methods);
	}


	public ToDoItemWrapper () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ToDoItemWrapper.class)
			mono.android.TypeManager.Activate ("caapa.ToDoItemWrapper, caapa, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
