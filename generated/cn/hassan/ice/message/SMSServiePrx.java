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
// Generated from file `SMSService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.hassan.ice.message;

public interface SMSServiePrx extends Ice.ObjectPrx
{
    public void sendSms(String msg);

    public void sendSms(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sendSms(String msg);

    public Ice.AsyncResult begin_sendSms(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sendSms(String msg, Ice.Callback __cb);

    public Ice.AsyncResult begin_sendSms(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_sendSms(String msg, Callback_SMSServie_sendSms __cb);

    public Ice.AsyncResult begin_sendSms(String msg, java.util.Map<String, String> __ctx, Callback_SMSServie_sendSms __cb);

    public Ice.AsyncResult begin_sendSms(String msg, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_sendSms(String msg, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_sendSms(String msg, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_sendSms(String msg, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public void end_sendSms(Ice.AsyncResult __result);
}