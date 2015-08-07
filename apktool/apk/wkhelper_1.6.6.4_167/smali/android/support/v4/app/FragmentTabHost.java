package android.support.v4.app; class FragmentTabHost { void a() { int a;
a=0;// .class public final Landroid/support/v4/app/FragmentTabHost;
a=0;// .super Landroid/widget/TabHost;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Landroid/support/v4/app/p;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;// .field private f:Landroid/support/v4/app/x;
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private a(Ljava/lang/String;Landroid/support/v4/app/y;)Landroid/support/v4/app/y;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/x;);v1=(Reference,Landroid/support/v4/app/x;);v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/x;
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/x;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     :goto_1
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/x;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "No tab known for tag "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/x;);
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->c:Landroid/support/v4/app/p;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/support/v4/app/y;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/app/y;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     :cond_3
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/x;->b:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v1, Landroid/support/v4/app/x;->c:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {v0, v2, v3}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentTabHost;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, v1, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v3, v1, Landroid/support/v4/app/x;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0, v2, v3}, Landroid/support/v4/app/y;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     :cond_5
a=0;//     return-object p2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v2=(Integer);
a=0;//     iget-object v0, v1, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/app/y;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Boolean);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final onAttachedToWindow()V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/support/v4/app/y;);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/x;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->c:Landroid/support/v4/app/p;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/p;);
a=0;//     iget-object v5, v0, Landroid/support/v4/app/x;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v4/app/p;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v4, v4, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/x;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->f:Landroid/support/v4/app/x;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/app/x;);v4=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentTabHost;->c:Landroid/support/v4/app/p;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/p;->a()Landroid/support/v4/app/y;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, v0, Landroid/support/v4/app/x;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->g:Z
a=0;// 
a=0;//     invoke-direct {p0, v3, v1}, Landroid/support/v4/app/FragmentTabHost;->a(Ljava/lang/String;Landroid/support/v4/app/y;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/y;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/y;->a()I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->c:Landroid/support/v4/app/p;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/p;->b()Z
a=0;// 
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, Landroid/support/v4/app/FragmentTabHost$SavedState;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/FragmentTabHost$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/FragmentTabHost$SavedState;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentTabHost;->setCurrentTabByTag(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v1, Landroid/support/v4/app/FragmentTabHost$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/FragmentTabHost$SavedState;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentTabHost$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/support/v4/app/FragmentTabHost$SavedState;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final onTabChanged(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/app/FragmentTabHost;->a(Ljava/lang/String;Landroid/support/v4/app/y;)Landroid/support/v4/app/y;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/y;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/y;->a()I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->e:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TabHost$OnTabChangeListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->e:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentTabHost;->e:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setup()V
a=0;//     .locals 2
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Must call setup() that takes a Context and FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// .end method
}}
