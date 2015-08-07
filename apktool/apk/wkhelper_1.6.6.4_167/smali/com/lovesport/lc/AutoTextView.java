package com.lovesport.lc; class AutoTextView { void a() { int a;
a=0;// .class public Lcom/lovesport/lc/AutoTextView;
a=0;// .super Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/lovesport/lc/AutoTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/lc/AutoTextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/lovesport/lc/AutoTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/lc/AutoTextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/lc/AutoTextView;);
a=0;//     invoke-static {p0}, Lcom/lovesport/lc/a;->a(Landroid/view/View;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/lovesport/lc/AutoTextView;->getTextSize()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Lcom/lovesport/lc/a;->a(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/lovesport/lc/AutoTextView;->setTextSize(IF)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/lc/AutoTextView;->getCompoundDrawablePadding()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcom/lovesport/lc/a;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/lc/AutoTextView;->setCompoundDrawablePadding(I)V
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/lc/AutoTextView;->getLineSpacingExtra()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Lcom/lovesport/lc/a;->a(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lovesport/lc/AutoTextView;->getLineSpacingMultiplier()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/lovesport/lc/AutoTextView;->setLineSpacing(FF)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setAutoTextSize(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lcom/lovesport/lc/a;->a(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/lovesport/lc/AutoTextView;->setTextSize(IF)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
