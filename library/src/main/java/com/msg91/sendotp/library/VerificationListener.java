package com.msg91.sendotp.library;

public abstract interface VerificationListener
{
  public abstract void onInitiated();
  
  public abstract void onInitiationFailed(Exception paramException);
  
  public abstract void onVerified();
  
  public abstract void onVerificationFailed(Exception paramException);
}

