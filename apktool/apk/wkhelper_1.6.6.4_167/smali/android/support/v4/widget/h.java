package android.support.v4.widget; class h { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/h;
a=0;// .super Landroid/support/v4/widget/aa;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;// .field private final b:I
a=0;// 
a=0;// .field private c:Landroid/support/v4/widget/y;
a=0;// 
a=0;// .field private final d:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->d:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(I)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->c:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget-object v5, v1, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, v4, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     iget v1, v1, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v6, v4, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget v6, v6, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     if-ne v6, v3, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     cmpl-float v6, v6, v7
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->hasWindowFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->getRootView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v6=(Integer);v7=(Conflicted);
a=0;//     iget v0, v4, Landroid/support/v4/widget/DrawerLayout;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v1, v0, :cond_2
a=0;// 
a=0;//     iput v1, v4, Landroid/support/v4/widget/DrawerLayout;->c:I
a=0;// 
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v1=(Integer);v2=(Null);v3=(One);v7=(Uninit);
a=0;//     if-eq v1, v0, :cond_4
a=0;// 
a=0;//     if-ne v6, v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v1=(PosByte);v6=(Byte);v7=(Null);
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x3f800000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iput-boolean v3, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     invoke-virtual {v4, v5, v3}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     and-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->c:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View;F)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/high16 v5, 0x3f000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, p1, v3}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     cmpl-float v0, p2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v4
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     cmpl-float v0, v1, v5
a=0;// 
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Byte);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->c:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget-boolean v3, v1, Landroid/support/v4/widget/y;->m:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Float);v3=(PosByte);
a=0;//     neg-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v3, p2, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     cmpl-float v3, p2, v4
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     cmpl-float v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Float);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/support/v4/widget/y;);v3=(Boolean);
a=0;//     iget-object v3, v1, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v4, v1, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/view/y;->a(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, v1, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v5, v1, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/support/v4/view/y;->b(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v0, v2, v3, v4}, Landroid/support/v4/widget/y;->a(IIII)Z
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     add-int v1, v0, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;F)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v1, p2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/h;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/View;I)I
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(PosByte);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->d:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     const-wide/16 v2, 0xa0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/widget/f;->c:Z
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/h;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/h;->a:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->d(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c(Landroid/view/View;)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final d(Landroid/view/View;)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
