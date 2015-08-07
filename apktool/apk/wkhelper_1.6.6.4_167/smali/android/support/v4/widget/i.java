package android.support.v4.widget; class i { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     check-cast p0, Landroid/view/WindowInsets;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/View;Ljava/lang/Object;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     check-cast p1, Landroid/view/WindowInsets;
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v1, v3, v2}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v3, v0, v1, v2}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/Object;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     check-cast p1, Landroid/view/WindowInsets;
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v1, v3, v2}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v3, v0, v1, v2}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
