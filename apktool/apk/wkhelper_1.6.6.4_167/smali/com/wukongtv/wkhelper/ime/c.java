package com.wukongtv.wkhelper.ime; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/ime/c;
a=0;// .super Lcom/wukongtv/wkhelper/o;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:I
a=0;// 
a=0;// .field c:Z
a=0;// 
a=0;// .field private d:[I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(JI[I)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput p3, p0, Lcom/wukongtv/wkhelper/ime/c;->b:I
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v0, p3, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v1, p4, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     aget v1, p4, v2
a=0;// 
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput v3, p0, Lcom/wukongtv/wkhelper/ime/c;->e:I
a=0;// 
a=0;//     iput v3, p0, Lcom/wukongtv/wkhelper/ime/c;->f:I
a=0;// 
a=0;//     invoke-virtual {p0, p0, p1, p2}, Lcom/wukongtv/wkhelper/ime/c;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     invoke-virtual {p0, p0}, Lcom/wukongtv/wkhelper/ime/c;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final run()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/c;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/c;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-boolean v7, p0, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->b(Lcom/wukongtv/wkhelper/ime/b;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->a(Lcom/wukongtv/wkhelper/ime/b;)[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->getLocationInWindow([I)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->b(Lcom/wukongtv/wkhelper/ime/b;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x33
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, v7
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aget v4, v4, v6
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->a(Lcom/wukongtv/wkhelper/ime/b;)[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/wukongtv/wkhelper/ime/b;->showAtLocation(Landroid/view/View;III)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/b;->dismiss()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->b(Lcom/wukongtv/wkhelper/ime/b;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->a(Lcom/wukongtv/wkhelper/ime/b;)[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->getLocationInWindow([I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     aget v1, v1, v7
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/ime/c;->d:[I
a=0;// 
a=0;//     aget v2, v2, v6
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/b;->a(Lcom/wukongtv/wkhelper/ime/b;)[I
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, v6
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/c;->e:I
a=0;// 
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/ime/c;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/wukongtv/wkhelper/ime/b;->update(IIII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
