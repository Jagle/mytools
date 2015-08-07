package com.wukongtv.wkhelper.widget; class c { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/widget/c;
a=0;// .super Landroid/app/DialogFragment;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Z
a=0;// 
a=0;// .field public b:Z
a=0;// 
a=0;// .field public c:Ljava/lang/String;
a=0;// 
a=0;// .field public d:Lcom/wukongtv/wkhelper/widget/d;
a=0;// 
a=0;// .field public e:Ljava/lang/String;
a=0;// 
a=0;// .field public f:Ljava/lang/String;
a=0;// 
a=0;// .field public g:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/widget/c;);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/widget/c;->a:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/widget/c;->b:Z
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/wukongtv/wkhelper/widget/c;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/widget/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/widget/c;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/widget/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->d:Lcom/wukongtv/wkhelper/widget/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/d;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->d:Lcom/wukongtv/wkhelper/widget/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/d;);
a=0;//     invoke-interface {v0}, Lcom/wukongtv/wkhelper/widget/d;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->d:Lcom/wukongtv/wkhelper/widget/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/widget/d;);
a=0;//     invoke-interface {v0}, Lcom/wukongtv/wkhelper/widget/d;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x7f0b003b
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     new-instance v2, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const v0, 0x7f03000a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const v0, 0x7f0b003b
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     const v1, 0x7f0b003d
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/widget/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/widget/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/widget/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/widget/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-boolean v3, p0, Lcom/wukongtv/wkhelper/widget/c;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v1, p0, Lcom/wukongtv/wkhelper/widget/c;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     :cond_3
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/widget/c;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/widget/c;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     const v0, 0x7f0b003c
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     const v0, 0x7f0b003a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/widget/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/widget/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const v0, 0x7f0b0039
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/widget/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
}}
