package com.wukongtv.wkhelper.f; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/f/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/f/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/os/IBinder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/f/c;);
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/f/c;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(IIILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "com.wukongtv.wkhelper.remoteplugin2.IRemoteInterface"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/f/c;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(IJZFDLjava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v4, "com.wukongtv.wkhelper.remoteplugin2.IRemoteInterface"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     invoke-virtual {v2, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeFloat(F)V
a=0;// 
a=0;//     invoke-virtual {v2, p6, p7}, Landroid/os/Parcel;->writeDouble(D)V
a=0;// 
a=0;//     invoke-virtual {v2, p8}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/f/c;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v4=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/f/c;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
}}
