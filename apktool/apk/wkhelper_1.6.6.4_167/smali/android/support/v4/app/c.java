package android.support.v4.app; class c { void a() { int a;
a=0;// .class final Landroid/support/v4/app/c;
a=0;// .super Landroid/support/v4/app/y;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Landroid/support/v4/app/q;
a=0;// 
a=0;// .field b:Landroid/support/v4/app/g;
a=0;// 
a=0;// .field c:Landroid/support/v4/app/g;
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:I
a=0;// 
a=0;// .field f:I
a=0;// 
a=0;// .field g:I
a=0;// 
a=0;// .field h:I
a=0;// 
a=0;// .field i:I
a=0;// 
a=0;// .field j:I
a=0;// 
a=0;// .field k:Z
a=0;// 
a=0;// .field l:Z
a=0;// 
a=0;// .field m:Ljava/lang/String;
a=0;// 
a=0;// .field n:Z
a=0;// 
a=0;// .field o:I
a=0;// 
a=0;// .field p:I
a=0;// 
a=0;// .field q:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field r:I
a=0;// 
a=0;// .field s:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field t:Ljava/util/ArrayList;
a=0;// 
a=0;// .field u:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/q;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/y;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/c;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/c;->l:Z
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/h;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     new-instance v2, Landroid/support/v4/app/h;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/app/h;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/app/h;-><init>(Landroid/support/v4/app/c;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/h;);
a=0;//     new-instance v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/View;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, v2, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v8, v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, v6}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/c;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/SparseArray;);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/c;->a(ILandroid/support/v4/app/h;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v1, v9
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     move v8, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v7, v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p2, v7}, Landroid/util/SparseArray;->keyAt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/SparseArray;);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/c;->a(ILandroid/support/v4/app/h;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v8, v9
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :cond_3
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Boolean);v4=(Reference,Landroid/util/SparseArray;);v5=(Reference,Landroid/util/SparseArray;);v7=(Null);
a=0;//     move v1, v8
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/app/h;ZLandroid/support/v4/app/Fragment;)Landroid/support/v4/c/a;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-instance v0, Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/a;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/c/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/a;);
a=0;//     iget-object v1, p3, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/util/Map;Landroid/view/View;)V
a=0;// 
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/support/v4/app/c;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/c/a;)Landroid/support/v4/c/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     iget-object v1, p3, Landroid/support/v4/app/Fragment;->Z:Landroid/support/v4/app/al;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p3, Landroid/support/v4/app/Fragment;->Z:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/c/f;->a(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p3, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p3, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {p1, v0, v3}, Landroid/support/v4/app/c;->b(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/app/h;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/c/a;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/a;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/c/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/a;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/app/z;->a(Ljava/util/Map;Landroid/view/View;)V
a=0;// 
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/c/f;->a(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/support/v4/app/c;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/c/a;)Landroid/support/v4/c/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->Z:Landroid/support/v4/app/al;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->Z:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {p1, v0, v3}, Landroid/support/v4/app/c;->b(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/c/a;)Landroid/support/v4/c/a;
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v4/c/a;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v1, Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/c/a;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/c/a;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/c/a;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/support/v4/c/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     move-object p2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLandroid/support/v4/c/a;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/al;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p3}, Landroid/support/v4/c/a;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p3}, Landroid/support/v4/c/a;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/al;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/app/h;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/h;ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/c/a;Landroid/support/v4/app/h;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/c/a;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/c/a;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/h;->c:Landroid/support/v4/app/ae;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ae;);
a=0;//     iput-object v0, v1, Landroid/support/v4/app/ae;->a:Landroid/view/View;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/app/h;ILjava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p2, :cond_0
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p1, Landroid/support/v4/app/h;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v4, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p3, v3, v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;Z)V
a=0;// 
a=0;//     iget-object v3, p1, Landroid/support/v4/app/h;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v3=(Boolean);
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-static {p3, v3, v2}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;Z)V
a=0;// 
a=0;//     iget-object v3, p1, Landroid/support/v4/app/h;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);
a=0;//     if-ge v3, v2, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/support/v4/c/a;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/app/z;->a(Landroid/view/View;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/h;->a:Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-static {v4, v0, v1}, Landroid/support/v4/app/c;->a(Landroid/support/v4/c/a;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v3=(Integer);v4=(Conflicted);
a=0;//     iget-object v4, p1, Landroid/support/v4/app/h;->a:Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-static {v4, v1, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/c/a;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/support/v4/c/a;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/c/a;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/c/a;->c(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v4/c/a;->a(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/c/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILandroid/support/v4/app/h;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
a=0;//     .locals 29
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/c;);
a=0;//     iget-object v4, v0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v4, v0}, Landroid/support/v4/app/o;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Landroid/support/v4/app/o;);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v20=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     if-nez v12, :cond_5
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v12, :cond_8
a=0;// 
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v22=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v20, :cond_b
a=0;// 
a=0;//     if-nez v7, :cond_b
a=0;// 
a=0;//     if-nez v22, :cond_b
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Reference,Landroid/support/v4/app/o;);v5=(Uninit);v7=(Uninit);v20=(Uninit);v22=(Uninit);
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->T:Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v5, Landroid/support/v4/app/Fragment;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->S:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Reference,Ljava/lang/Object;);v20=(Uninit);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->T:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Uninit);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->Q:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);v20=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz p3, :cond_7
a=0;// 
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->V:Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v5, Landroid/support/v4/app/Fragment;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v4, v5, :cond_6
a=0;// 
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->U:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_5
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Reference,Ljava/lang/Object;);v7=(Uninit);
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->V:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->U:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_8
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz p3, :cond_a
a=0;// 
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->R:Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v5, Landroid/support/v4/app/Fragment;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v4, v5, :cond_9
a=0;// 
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->Q:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_6
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v5=(Reference,Ljava/lang/Object;);v22=(Uninit);
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->R:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_a
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v4, v12, Landroid/support/v4/app/Fragment;->S:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_b
a=0;//     #v22=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v7, :cond_c
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/h;);
a=0;//     move/from16 v2, p3
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {v0, v1, v12, v2}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/h;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/c/a;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/c/a;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_12
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :goto_7
a=0;//     if-eqz p3, :cond_13
a=0;// 
a=0;//     iget-object v5, v12, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     :goto_8
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/c/a;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Set;);
a=0;//     invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/c/a;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v23, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v22, :cond_d
a=0;// 
a=0;//     iget-object v5, v12, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0, v5, v1, v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v5, :cond_f
a=0;// 
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v4/c/a;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     if-eqz v22, :cond_e
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;)V
a=0;// 
a=0;//     :cond_e
a=0;//     if-eqz v7, :cond_f
a=0;// 
a=0;//     invoke-static {v7, v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;)V
a=0;// 
a=0;//     :cond_f
a=0;//     #v9=(Conflicted);
a=0;//     new-instance v18, Landroid/support/v4/app/d;
a=0;// 
a=0;//     #v18=(UninitRef,Landroid/support/v4/app/d;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/d;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/c;);
a=0;//     invoke-direct {v0, v1, v11}, Landroid/support/v4/app/d;-><init>(Landroid/support/v4/app/c;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/d;);v18=(Reference,Landroid/support/v4/app/d;);
a=0;//     if-eqz v7, :cond_10
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     new-instance v4, Landroid/support/v4/app/e;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/app/e;);
a=0;//     move-object/from16 v5, p0
a=0;// 
a=0;//     move-object/from16 v9, p2
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/app/h;);
a=0;//     move/from16 v10, p3
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     invoke-direct/range {v4 .. v12}, Landroid/support/v4/app/e;-><init>(Landroid/support/v4/app/c;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Landroid/support/v4/app/h;ZLandroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/e;);
a=0;//     invoke-virtual {v13, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     :cond_10
a=0;//     #v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);
a=0;//     new-instance v16, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v16=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v17, Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v17=(UninitRef,Landroid/support/v4/c/a;);
a=0;//     invoke-direct/range {v17 .. v17}, Landroid/support/v4/c/a;-><init>()V
a=0;// 
a=0;//     #v17=(Reference,Landroid/support/v4/c/a;);
a=0;//     if-eqz p3, :cond_15
a=0;// 
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->W:Ljava/lang/Boolean;
a=0;// 
a=0;//     if-nez v4, :cond_14
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_9
a=0;//     #v4=(Boolean);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-static {v0, v1, v7, v4}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v26, :cond_11
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/app/h;->c:Landroid/support/v4/app/ae;
a=0;// 
a=0;//     #v14=(Reference,Landroid/support/v4/app/ae;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/app/h;->a:Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/c/a;);
a=0;//     move-object/from16 v9, v20
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     move-object v10, v7
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     move-object v11, v6
a=0;// 
a=0;//     move-object/from16 v12, v18
a=0;// 
a=0;//     move-object/from16 v18, v8
a=0;// 
a=0;//     invoke-static/range {v9 .. v18}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/app/af;Landroid/view/View;Landroid/support/v4/app/ae;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     new-instance v9, Landroid/support/v4/app/f;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/support/v4/app/f;);
a=0;//     move-object/from16 v10, p0
a=0;// 
a=0;//     move-object v11, v6
a=0;// 
a=0;//     move-object/from16 v12, p2
a=0;// 
a=0;//     move/from16 v13, p1
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v14, v26
a=0;// 
a=0;//     invoke-direct/range {v9 .. v14}, Landroid/support/v4/app/f;-><init>(Landroid/support/v4/app/c;Landroid/view/View;Landroid/support/v4/app/h;ILjava/lang/Object;)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/app/f;);
a=0;//     invoke-virtual {v4, v9}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     invoke-static {v0, v4, v5}, Landroid/support/v4/app/z;->a(Ljava/lang/Object;Landroid/view/View;Z)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     move/from16 v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v26
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/h;ILjava/lang/Object;)V
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     invoke-static {v6, v0}, Landroid/support/v4/app/z;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/h;->d:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/h;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v18, v6
a=0;// 
a=0;//     move-object/from16 v21, v16
a=0;// 
a=0;//     #v21=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v24, v7
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v8
a=0;// 
a=0;//     #v25=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v28, v17
a=0;// 
a=0;//     #v28=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-static/range {v18 .. v28}, Landroid/support/v4/app/z;->a(Landroid/view/View;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/Map;)V
a=0;// 
a=0;//     :cond_11
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v19=(Conflicted);v21=(Conflicted);v24=(Conflicted);v25=(Conflicted);v27=(Conflicted);v28=(Conflicted);
a=0;//     if-eqz v26, :cond_17
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_12
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Reference,Landroid/support/v4/c/a;);v5=(Boolean);v9=(Uninit);v10=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v21=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/c/a;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Collection;);
a=0;//     invoke-virtual {v8, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_13
a=0;//     iget-object v5, v11, Landroid/support/v4/app/Fragment;->Y:Landroid/support/v4/app/al;
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_14
a=0;//     #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v16=(Reference,Ljava/util/ArrayList;);v17=(Reference,Landroid/support/v4/c/a;);v18=(Reference,Landroid/support/v4/app/d;);v23=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->W:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_15
a=0;//     #v4=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->X:Ljava/lang/Boolean;
a=0;// 
a=0;//     if-nez v4, :cond_16
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_16
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     iget-object v4, v11, Landroid/support/v4/app/Fragment;->X:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_17
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v14=(Conflicted);v15=(Conflicted);v19=(Conflicted);v21=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Reference,Ljava/lang/Object;);v27=(Conflicted);v28=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/support/v4/app/h;Landroid/support/v4/c/a;Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/c/a;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/support/v4/c/a;->b(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/support/v4/c/a;->c(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/app/z;->a(Landroid/view/View;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-static {v4, v0, v1}, Landroid/support/v4/app/c;->a(Landroid/support/v4/c/a;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/c/a;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/a;);
a=0;//     invoke-static {v4, v1, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/c/a;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v4/app/o;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Reference,Landroid/support/v4/app/g;);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v2, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ne v0, v2, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);v2=(Conflicted);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v2}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->n:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "commit already called"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Commit: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/e;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/e;);
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/c/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/e;);
a=0;//     new-instance v1, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v0, "  "
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/c;->n:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/c;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/q;->c()V
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, v1, Landroid/support/v4/app/q;->t:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Activity has been destroyed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(One);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v1, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/m;->a:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/q;->y:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/m;->a:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/q;->y:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/support/v4/app/h;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/h;
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "popFromBackStack: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/e;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/e;);
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/c/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/e;);
a=0;//     new-instance v1, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v0, "  "
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p3}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p2, p3, v9}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/h;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/app/c;->a(I)V
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move v6, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Integer);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Reference,Landroid/support/v4/app/g;);v7=(Conflicted);
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     iget v3, v5, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Unknown cmd: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, v5, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->j:I
a=0;// 
a=0;//     move v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Landroid/support/v4/app/g;);v7=(Conflicted);
a=0;//     iget v0, v5, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, v5, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v0, v3, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v6}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v3, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     iput v0, v3, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v3, v7, v6}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_7
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v7, v0, v2}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/q;->c(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v3, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v0, v3, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v6}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/q;->e(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/q;->d(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget v2, v2, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/q;->b(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1, v6, v9}, Landroid/support/v4/app/q;->a(IIIZ)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_b
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, v1, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, v1, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_a
a=0;//     sget-boolean v2, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, v1, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     iput v8, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/y;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iput-object v0, p2, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     iget-object v0, p2, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p2, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Can\'t change tag of fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ": was "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p2, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " now "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     iput-object p3, p2, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     iget v0, p2, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p2, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     if-eq v0, p1, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Can\'t change container ID of fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ": was "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p2, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " now "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iput p1, p2, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     iput p1, p2, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/g;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     iput-object p2, v0, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/g;)V
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/y;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/g;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     iput-object p1, v0, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/g;)V
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method final a(I)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Bump nesting in "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " by "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/support/v4/app/g;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Bump nesting of "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " to "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, v1, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_5
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, p1
a=0;// 
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     sget-boolean v3, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Bump nesting of "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " to "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final a(Landroid/support/v4/app/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/g;
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     :goto_0
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->f:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->g:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->h:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->d:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/c;->d:I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/g;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/g;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/g;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/g;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v4/app/o;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Landroid/support/v4/app/g;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v0, v2, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, v2, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p3, :cond_8
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mName="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mIndex="
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v0, " mCommitted="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->n:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mTransition=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mTransitionStyle=#"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->f:I
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mEnterAnim=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->h:I
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mPopEnterAnim=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mPopExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->p:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mBreadCrumbTitleRes=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->p:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mBreadCrumbTitleText="
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_6
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->r:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mBreadCrumbShortTitleRes=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->r:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " mBreadCrumbShortTitleText="
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Operations:"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "    "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Reference,Landroid/support/v4/app/g;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "cmd="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, v3, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  Op #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " "
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz p3, :cond_c
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "enterAnim=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " exitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     :cond_b
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "popEnterAnim=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, " popExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, v3, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     iget-object v0, v3, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_f
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v5, v3, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v0, v5, :cond_f
a=0;// 
a=0;//     invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v3, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_d
a=0;// 
a=0;//     const-string v5, "Removed: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_3
a=0;//     iget-object v5, v3, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v0, "NULL"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "ADD"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "REPLACE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "REMOVE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "HIDE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "SHOW"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "DETACH"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "ATTACH"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Integer);v5=(Integer);v6=(One);
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     const-string v5, "Removed:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_e
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/y;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/g;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     iput-object p1, v0, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/g;)V
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final run()V
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Run: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "addToBackStack() called after commit()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     invoke-virtual {p0, v13}, Landroid/support/v4/app/c;->a(I)V
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x15
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_12
a=0;// 
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v10, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v10=(Reference,Landroid/support/v4/app/h;);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v9=(Integer);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v8, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/support/v4/app/g;);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v8, :cond_f
a=0;// 
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     move v7, v2
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v7=(Integer);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Integer);
a=0;//     iget v0, v8, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Unknown cmd: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, v8, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v9, v0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/support/v4/app/g;);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget v0, v8, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, v8, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_0
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v7, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v8, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v4, :cond_d
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v4, v0, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     sget-boolean v11, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_7
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "OP_REPLACE: adding="
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " old="
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_7
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget v12, v5, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ne v11, v12, :cond_9
a=0;// 
a=0;//     :cond_8
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     if-ne v0, v5, :cond_a
a=0;// 
a=0;//     iput-object v6, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_8
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v11, v8, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v11, :cond_b
a=0;// 
a=0;//     new-instance v11, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v11, v8, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v11, v8, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-boolean v11, p0, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_c
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     iput v11, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     sget-boolean v11, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_c
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "Bump nesting of "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " to "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_c
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v11, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v11, v0, v1, v9}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_d
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);v5=(Conflicted);v11=(Conflicted);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     iput v7, v5, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v0, v5, v2}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v7, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/q;->c(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/q;->d(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, v8, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput v7, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/q;);
a=0;//     invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/q;->e(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_f
a=0;//     #v3=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget v2, v2, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v1, v9, v13}, Landroid/support/v4/app/q;->a(IIIZ)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     iget-object v1, v0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_10
a=0;//     iget-object v1, v0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->e()V
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     move-object v10, v6
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "BackStackEntry{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     const-string v1, " #"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
