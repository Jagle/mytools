package com.alimama.mobile; class a { void a() { int a;
a=0;// .class public final Lcom/alimama/mobile/a;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Lcom/alimama/mobile/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/alimama/mobile/b;
a=0;// 
a=0;// .field b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;// .field c:Landroid/view/View;
a=0;// 
a=0;// .field d:Landroid/view/View;
a=0;// 
a=0;// .field e:Landroid/widget/TextView;
a=0;// 
a=0;// .field f:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field g:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/alimama/mobile/a;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/alimama/mobile/a;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(ILjava/util/List;)V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p0, Lcom/alimama/mobile/a;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "reviced mm promoters,but the activity is finish."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     if-ge v2, v10, :cond_1
a=0;// 
a=0;//     invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/a;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v5, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     #v5=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v5, v5, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v6, v5, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v7, "tb_munion_aditem"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "layout"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v5, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v1, v5, v6}, Lcom/alimama/mobile/a;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v6, v1, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v7, "ad_image"
a=0;// 
a=0;//     const-string v8, "id"
a=0;// 
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/a;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v6, v1, v7}, Lcom/umeng/update/net/x;->a(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v6, 0x3f800000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iget-object v6, p0, Lcom/alimama/mobile/a;->f:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v6, v5, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/a;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-array v0, v0, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     array-length v2, v0
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unable send impression report.[promoters="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->c:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,[Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);v2=(Integer);
a=0;//     new-instance v2, Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     invoke-direct {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     iput v3, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     iput v3, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/b/d;->a()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u52a0\u8f7d\u5931\u8d25..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)Z
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/alimama/mobile/b;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-object v5, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     #v5=(Reference,Lcom/alimama/mobile/b;);
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/a;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-boolean v3, v5, Lcom/alimama/mobile/b;->d:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v6, Lcom/alimama/mobile/csdk/umupdate/a/m;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/m;);
a=0;//     invoke-direct {v6}, Lcom/alimama/mobile/csdk/umupdate/a/m;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/m;);
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/n;);
a=0;//     invoke-direct {v0}, Lcom/alimama/mobile/csdk/umupdate/a/n;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/n;);
a=0;//     const-string v3, "*"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/n;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "2G/3G"
a=0;// 
a=0;//     iput-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/n;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "Wi-Fi"
a=0;// 
a=0;//     iput-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/n;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "Unknown"
a=0;// 
a=0;//     iput-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v5, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iput-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->s:Landroid/content/Context;
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->a:Lcom/alimama/mobile/csdk/umupdate/a/n;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->b:Ljava/lang/String;
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->c:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->c:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->e:Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v0, "android.permission.READ_PHONE_STATE"
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->c(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->q:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->g:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "android.permission.ACCESS_WIFI_STATE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->c(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->l:Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v4, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     iget v0, v4, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->o:I
a=0;// 
a=0;//     iget v0, v4, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     iput v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->p:I
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v7, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->p:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v7, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->a:Lcom/alimama/mobile/csdk/umupdate/a/n;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/alimama/mobile/csdk/umupdate/a/n;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v7, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->o:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->m:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, v4, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->n:F
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v3, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v3, 0x36ee80
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/2addr v0, v3
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->i:Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v4=(Null);
a=0;//     new-instance v7, Ljava/io/FileReader;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileReader;);
a=0;//     const-string v0, "/proc/cpuinfo"
a=0;// 
a=0;//     invoke-direct {v7, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
a=0;// 
a=0;//     :try_start_7
a=0;//     #v7=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v3, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {v3, v7, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const/16 v4, 0x3a
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/alimama/mobile/csdk/umupdate/a/m;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->r:Ljava/lang/String;
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_9
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
a=0;// 
a=0;//     :goto_6
a=0;//     #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iput-object v6, v5, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/q;);
a=0;//     iget-object v3, v5, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v3}, Lcom/alimama/mobile/csdk/umupdate/a/q;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/q;);
a=0;//     iput-object v0, v5, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iput-boolean v1, v5, Lcom/alimama/mobile/b;->d:Z
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/a;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v4, v3, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v5, "tb_munion_adview"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "layout"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v3, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v3, p0}, Lcom/alimama/mobile/a;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v4, "progress_frame"
a=0;// 
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/alimama/mobile/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->c:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     const-string v4, "promoter_frame"
a=0;// 
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/alimama/mobile/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->f:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     invoke-direct {v0, p1}, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/alimama/mobile/a;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->c:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v4, "status_msg"
a=0;// 
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/alimama/mobile/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v4, "loading"
a=0;// 
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/alimama/mobile/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/a;->d:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->d:Landroid/view/View;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/alimama/mobile/a;->a:Lcom/alimama/mobile/b;
a=0;// 
a=0;//     #v3=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/a;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->a()V
a=0;// 
a=0;//     new-instance v4, Lcom/alimama/mobile/csdk/umupdate/models/d;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     invoke-direct {v4, v0}, Lcom/alimama/mobile/csdk/umupdate/models/d;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);
a=0;//     iget-object v0, v4, Lcom/alimama/mobile/csdk/umupdate/models/d;->a:Lcom/alimama/mobile/csdk/umupdate/models/e;
a=0;// 
a=0;//     iget-object v5, v3, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/alimama/mobile/csdk/umupdate/models/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v5, v0, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     iget-object v0, v4, Lcom/alimama/mobile/csdk/umupdate/models/d;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->I:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_7
a=0;//     new-instance v5, Lcom/alimama/mobile/c;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/alimama/mobile/c;);
a=0;//     invoke-direct {v5, v3, p0, v0, v4}, Lcom/alimama/mobile/c;-><init>(Lcom/alimama/mobile/b;Lcom/alimama/mobile/e;ZLcom/alimama/mobile/csdk/umupdate/models/d;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/alimama/mobile/c;);
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/r;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/r;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-direct {v0, v4, v5, v3, v6}, Lcom/alimama/mobile/csdk/umupdate/a/r;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/d;Lcom/alimama/mobile/e;IZ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/r;);
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/a/r;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Void;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8
a=0;// 
a=0;//     :goto_8
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_9
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(One);v4=(Reference,Ujava/lang/Object;);v5=(Reference,Lcom/alimama/mobile/b;);v6=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/m;);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v4, "Failed to lookup application label.  Make sure this is specified in your AndroidManifest.xml"
a=0;// 
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v4, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "Get PackageInfo exception."
a=0;// 
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v4, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "Get TelephonyManager exception."
a=0;// 
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v4, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "Get WifiManager exception."
a=0;// 
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v4, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "Get WindowManager exception."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v7, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v4, v7}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_b
a=0;//     iget-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->a:Lcom/alimama/mobile/csdk/umupdate/a/n;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->f:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v6, Lcom/alimama/mobile/csdk/umupdate/a/m;->h:Ljava/lang/String;
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "Get Configuration exception."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3, v4}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_a
a=0;//     :try_start_c
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);v4=(Integer);
a=0;//     const-string v4, "Could not read from file /proc/cpuinfo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     invoke-static {v4, v8}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-virtual {v7}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v3, "Could not open file /proc/cpuinfo"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v0, v4, v2
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Null);v7=(Reference,Ljava/io/FileReader;);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_b
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-virtual {v7}, Ljava/io/FileReader;->close()V
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v4=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/d;);v6=(Null);v7=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_a
a=0;//     :try_start_f
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/a/r;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/r;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v0, v4, p0, v3, v5}, Lcom/alimama/mobile/csdk/umupdate/a/r;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/d;Lcom/alimama/mobile/e;IZ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/r;);
a=0;//     sget-object v3, Lcom/alimama/mobile/csdk/umupdate/a/r;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Void;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/alimama/mobile/csdk/umupdate/a/r;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "mmsdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "An error occurred while initializing MMAdView."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(One);v5=(Reference,Lcom/alimama/mobile/b;);v6=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/m;);v7=(Reference,Ljava/io/FileReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v4=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_a
a=0;// .end method
a=0;// 
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/a;->b:Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/b;->a:Lcom/alimama/mobile/csdk/umupdate/a/a;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->u:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Lcom/alimama/mobile/csdk/umupdate/a/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     new-instance v2, Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     invoke-direct {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     iput v4, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     iput v4, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     new-array v1, v5, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     aput-object v0, v1, v4
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/d;->a()V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->s:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->s:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/alimama/mobile/csdk/umupdate/a/s;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);v1=(Reference,Ljava/lang/Object;);v2=(Null);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/b;);
a=0;//     iget-object v1, v1, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->u:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     iget v2, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->h:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u4e0d\u652f\u6301\u8be5\u70b9\u51fb."
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     new-instance v2, Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     invoke-direct {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     iput v4, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     iput v6, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     new-array v1, v5, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     aput-object v0, v1, v4
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a()Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/alimama/mobile/csdk/umupdate/b/d;->a()V
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->q:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v1, Lcom/alimama/mobile/csdk/umupdate/a/o;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/alimama/mobile/csdk/umupdate/a/p;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u65e0\u6cd5\u627e\u5230\u6d4f\u89c8\u5668."
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);
a=0;//     new-instance v2, Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     invoke-direct {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/MMEntity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/e;);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->a:I
a=0;// 
a=0;//     iput v4, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->b:I
a=0;// 
a=0;//     iput v6, v2, Lcom/alimama/mobile/csdk/umupdate/b/e;->c:I
a=0;// 
a=0;//     new-array v1, v5, [Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     aput-object v0, v1, v4
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/alimama/mobile/csdk/umupdate/b/e;->a([Lcom/alimama/mobile/csdk/umupdate/models/Promoter;)Lcom/alimama/mobile/csdk/umupdate/b/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/t;);
a=0;//     invoke-direct {v2, v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/t;-><init>(Lcom/alimama/mobile/csdk/umupdate/models/Promoter;Lcom/alimama/mobile/csdk/umupdate/b/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/t;);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/t;->a:Ljava/lang/String;
a=0;// 
a=0;//     new-array v1, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "start Download."
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/alimama/mobile/csdk/umupdate/a/t;->b:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/update/net/i;->a()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
