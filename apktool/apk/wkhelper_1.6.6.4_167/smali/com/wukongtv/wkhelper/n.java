package com.wukongtv.wkhelper; class n { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/n;
a=0;// .super Lcom/wukongtv/wkhelper/o;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/MainActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/o;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/n;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/n;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->a(Lcom/wukongtv/wkhelper/MainActivity;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v4, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->c(Lcom/wukongtv/wkhelper/MainActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->b(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->d(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->b(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->c(Lcom/wukongtv/wkhelper/MainActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->e(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     :cond_2
a=0;//     instance-of v2, v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->f(Lcom/wukongtv/wkhelper/MainActivity;)Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setImageResource(I)V
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->g(Lcom/wukongtv/wkhelper/MainActivity;)Lcom/wukongtv/wkhelper/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-wide/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v4, v2, v3}, Lcom/wukongtv/wkhelper/n;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Boolean);v3=(Integer);
a=0;//     instance-of v2, v1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->f(Lcom/wukongtv/wkhelper/MainActivity;)Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setImageLoaderUri(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
