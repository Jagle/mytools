package com.wukongtv.wkhelper.controller.b; class d { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/controller/b/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/wukongtv/wkhelper/controller/b/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/controller/b/c;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/b/d;->b:Lcom/wukongtv/wkhelper/controller/b/c;
a=0;// 
a=0;//     iput p2, p0, Lcom/wukongtv/wkhelper/controller/b/d;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/b/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x42
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/d;->b:Lcom/wukongtv/wkhelper/controller/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/c;);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/controller/b/c;->c:Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/b/b;);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/controller/b/d;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/controller/b/b;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x17
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v2=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     invoke-virtual {v1, v4}, Lcom/wukongtv/wkhelper/controller/b/b;->a(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lnet/pocketmagic/android/eventinjector/a;->a(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lcom/wukongtv/wkhelper/controller/b/b;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v2=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v0, v3}, Lnet/pocketmagic/android/eventinjector/a;->a(IZ)I
a=0;// 
a=0;//     const-wide/16 v2, 0x32
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lnet/pocketmagic/android/eventinjector/a;->a(IZ)I
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
