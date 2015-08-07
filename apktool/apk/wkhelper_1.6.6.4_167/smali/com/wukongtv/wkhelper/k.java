package com.wukongtv.wkhelper; class k { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/MainActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/k;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->a(Lcom/wukongtv/wkhelper/MainActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->n(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/MainActivity;->j(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/MainActivity;->b(Lcom/wukongtv/wkhelper/MainActivity;I)I
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/widget/AdapterView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/MainActivity;->n(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->n(Lcom/wukongtv/wkhelper/MainActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/lovesport/lc/AutoTextView;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/lovesport/lc/AutoTextView;->setTextColor(I)V
a=0;// 
a=0;//     const/high16 v1, 0x41900000
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/lc/AutoTextView;->setAutoTextSize(F)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/widget/AdapterView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/lovesport/lc/AutoTextView;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/lovesport/lc/AutoTextView;->setTextColor(I)V
a=0;// 
a=0;//     const/high16 v1, 0x41a00000
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/lc/AutoTextView;->setAutoTextSize(F)V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/k;->a:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-static {v0, p3}, Lcom/wukongtv/wkhelper/MainActivity;->b(Lcom/wukongtv/wkhelper/MainActivity;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onNothingSelected(Landroid/widget/AdapterView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
