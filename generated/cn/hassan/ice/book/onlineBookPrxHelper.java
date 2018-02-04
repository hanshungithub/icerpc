// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.hassan.ice.book;

/**
 * Provides type-specific helper functions.
 **/
public final class onlineBookPrxHelper extends Ice.ObjectPrxHelperBase implements onlineBookPrx
{
    private static final String __bookTick_name = "bookTick";

    public Message bookTick(Message msg)
    {
        return bookTick(msg, null, false);
    }

    public Message bookTick(Message msg, java.util.Map<String, String> __ctx)
    {
        return bookTick(msg, __ctx, true);
    }

    private Message bookTick(Message msg, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__bookTick_name);
        return end_bookTick(begin_bookTick(msg, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_bookTick(Message msg)
    {
        return begin_bookTick(msg, null, false, false, null);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, java.util.Map<String, String> __ctx)
    {
        return begin_bookTick(msg, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, Ice.Callback __cb)
    {
        return begin_bookTick(msg, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_bookTick(msg, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, Callback_onlineBook_bookTick __cb)
    {
        return begin_bookTick(msg, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, java.util.Map<String, String> __ctx, Callback_onlineBook_bookTick __cb)
    {
        return begin_bookTick(msg, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, 
                                          IceInternal.Functional_GenericCallback1<Message> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_bookTick(msg, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, 
                                          IceInternal.Functional_GenericCallback1<Message> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_bookTick(msg, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<Message> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_bookTick(msg, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_bookTick(Message msg, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<Message> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_bookTick(msg, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_bookTick(Message msg, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_GenericCallback1<Message> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_bookTick(msg, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackArg1<cn.hassan.ice.book.Message>(__responseCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          onlineBookPrxHelper.__bookTick_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_bookTick(Message msg, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__bookTick_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__bookTick_name, __cb);
        try
        {
            __result.prepare(__bookTick_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            Message.__write(__os, msg);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public Message end_bookTick(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __bookTick_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            Message __ret = null;
            __ret = Message.__read(__is, __ret);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __bookTick_completed(Ice.TwowayCallbackArg1<Message> __cb, Ice.AsyncResult __result)
    {
        cn.hassan.ice.book.onlineBookPrx __proxy = (cn.hassan.ice.book.onlineBookPrx)__result.getProxy();
        Message __ret = null;
        try
        {
            __ret = __proxy.end_bookTick(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static onlineBookPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static onlineBookPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static onlineBookPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static onlineBookPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static onlineBookPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static onlineBookPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, onlineBookPrx.class, onlineBookPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::book::onlineBook"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, onlineBookPrx v)
    {
        __os.writeProxy(v);
    }

    public static onlineBookPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            onlineBookPrxHelper result = new onlineBookPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}