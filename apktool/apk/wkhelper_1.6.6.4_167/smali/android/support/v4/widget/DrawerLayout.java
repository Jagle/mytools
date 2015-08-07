package android.support.v4.widget; class DrawerLayout { void a() { int a;
a=0;// .class public final Landroid/support/v4/widget/DrawerLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final d:Landroid/support/v4/widget/b;
a=0;// 
a=0;// .field private static final e:[I
a=0;// 
a=0;// .field private static final f:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private A:Z
a=0;// 
a=0;// .field final a:Landroid/support/v4/widget/y;
a=0;// 
a=0;// .field final b:Landroid/support/v4/widget/y;
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field private final g:Landroid/support/v4/widget/a;
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:F
a=0;// 
a=0;// .field private k:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private final l:Landroid/support/v4/widget/h;
a=0;// 
a=0;// .field private final m:Landroid/support/v4/widget/h;
a=0;// 
a=0;// .field private n:Z
a=0;// 
a=0;// .field private o:Z
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private q:I
a=0;// 
a=0;// .field private r:Z
a=0;// 
a=0;// .field private s:Z
a=0;// 
a=0;// .field private t:Landroid/support/v4/widget/e;
a=0;// 
a=0;// .field private u:F
a=0;// 
a=0;// .field private v:F
a=0;// 
a=0;// .field private w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private z:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v2, v0, [I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     const v3, 0x10100b3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aput v3, v2, v1
a=0;// 
a=0;//     sput-object v2, Landroid/support/v4/widget/DrawerLayout;->e:[I
a=0;// 
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x13
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Landroid/support/v4/widget/DrawerLayout;->f:Z
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x15
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/c;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/c;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/c;);
a=0;//     sput-object v0, Landroid/support/v4/widget/DrawerLayout;->d:Landroid/support/v4/widget/b;
a=0;// 
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     new-instance v0, Landroid/support/v4/widget/d;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/d;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/d;);
a=0;//     sput-object v0, Landroid/support/v4/widget/DrawerLayout;->d:Landroid/support/v4/widget/b;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(II)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/view/g;->a(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->p:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->q:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->g(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->d(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/view/View;F)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     iput p1, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     invoke-static {v5}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/widget/f;->c:Z
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {p0, v5, v7}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/y;);
a=0;//     neg-int v6, v6
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v5, v6, v8}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iput-boolean v3, v0, Landroid/support/v4/widget/f;->c:Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v5=(Reference,Landroid/view/View;);v6=(Integer);v7=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v5, v7, v8}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->l:Landroid/support/v4/widget/h;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/h;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/h;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->m:Landroid/support/v4/widget/h;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/h;->a()V
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()[I
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/widget/DrawerLayout;->e:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b(Landroid/view/View;)F
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private b()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
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
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/view/View;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private c()Landroid/view/View;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     if-ge v3, v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "View "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Null);v3=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     cmpl-float v0, v0, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Reference,Landroid/view/View;);v5=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method static c(Landroid/view/View;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/g;->a(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method private e(Landroid/view/View;)I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/g;->a(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static f(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method private g(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->o:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     invoke-virtual {p0, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(One);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/view/View;)I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->e(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->p:I
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->q:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final a(I)Landroid/view/View;
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/g;->a(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     and-int/lit8 v2, v0, 0x7
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->e(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x7
a=0;// 
a=0;//     if-ne v4, v2, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method final a(Landroid/view/View;Z)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     if-ne v2, p1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/view/ad;->b(Landroid/view/View;I)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/view/ad;->b(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->e(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p2
a=0;// 
a=0;//     if-ne v0, p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;I)V
a=0;// 
a=0;//     :goto_0
a=0;//     sget-boolean v0, Landroid/support/v4/widget/DrawerLayout;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->g:Landroid/support/v4/widget/a;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/a;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ad;->a(Landroid/view/View;Landroid/support/v4/view/a;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final computeScroll()V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Float);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     iput v2, p0, Landroid/support/v4/widget/DrawerLayout;->j:F
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/y;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/y;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->o:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/f;->d:Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 11
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p2}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v3, v7, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eq v8, p2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-ne v0, v9, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v9=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {v8}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v8, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_a
a=0;// 
a=0;//     :goto_2
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v9=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v9=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/DrawerLayout;->j:F
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/DrawerLayout;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     ushr-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     #v2=(Char);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->j:F
a=0;// 
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shl-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->i:I
a=0;// 
a=0;//     const v4, 0xffffff
a=0;// 
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->k:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Float);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v2=(Byte);v3=(Null);v5=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p2, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget v2, v2, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v2, v4, v2
a=0;// 
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v1, v4, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/high16 v1, 0x437f0000
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->w:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v2=(Byte);v3=(Null);v5=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p2, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, v1
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget v3, v3, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x3f800000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v0, v4, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/high16 v1, 0x437f0000
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->x:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v2=(Integer);v3=(Integer);v5=(Boolean);v7=(Integer);v8=(Reference,Landroid/view/View;);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/f;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/f;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/f;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/f;);
a=0;//     check-cast p1, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/f;-><init>(Landroid/support/v4/widget/f;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/f;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/f;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/f;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/f;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->o:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->o:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/widget/DrawerLayout;->d:Landroid/support/v4/widget/b;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->z:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/widget/b;->a(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v4/widget/y;->a(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v4/widget/y;->a(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     or-int/2addr v4, v3
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v4, :cond_9
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/f;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->s:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v2=(Null);v3=(Boolean);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->u:F
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->v:F
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/DrawerLayout;->j:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     cmpl-float v5, v5, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_a
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/y;);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v5, v0, v3}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->s:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v3=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget-object v0, v5, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v0, v6, :cond_7
a=0;// 
a=0;//     iget v3, v5, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     shl-int v7, v1, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/2addr v3, v7
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_6
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v3, v5, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     aget v3, v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v7, v5, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     aget v7, v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v3, v7
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v7, v5, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     aget v7, v7, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, v5, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     aget v8, v8, v0
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-float/2addr v7, v8
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v3, v3
a=0;// 
a=0;//     mul-float/2addr v7, v7
a=0;// 
a=0;//     add-float/2addr v3, v7
a=0;// 
a=0;//     iget v7, v5, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, v5, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     mul-int/2addr v7, v8
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v3, v3, v7
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v3=(Boolean);v7=(Integer);v8=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->l:Landroid/support/v4/widget/h;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/h;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/h;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->m:Landroid/support/v4/widget/h;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/h;->a()V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(Integer);v7=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Byte);v7=(Float);v8=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Boolean);v7=(Integer);v8=(Conflicted);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->s:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v3=(Integer);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v4=(Boolean);v6=(Null);v7=(Uninit);v8=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->c()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-static {p2}, Landroid/support/v4/view/l;->c(Landroid/view/KeyEvent;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->c()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(PosByte);v2=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final onLayout(ZIIII)V
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->n:Z
a=0;// 
a=0;//     sub-int v6, p4, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v5, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v5, v7, :cond_8
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     invoke-static {v8}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/widget/f;->leftMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v0, Landroid/support/v4/widget/f;->leftMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     invoke-virtual {v8, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v5, 0x1
a=0;// 
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v1=(Boolean);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v8, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     neg-int v1, v9
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v9
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     add-int v1, v9, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     :goto_2
a=0;//     iget v3, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     cmpl-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     iget v4, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x70
a=0;// 
a=0;//     sparse-switch v4, :sswitch_data_0
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v10, v11
a=0;// 
a=0;//     invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     :goto_4
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-static {v8, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;F)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);
a=0;//     int-to-float v1, v9
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, v0, Landroid/support/v4/widget/f;->b:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v2, v6, v1
a=0;// 
a=0;//     sub-int v1, v6, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v3=(Boolean);v4=(Integer);
a=0;//     sub-int v4, p5, p3
a=0;// 
a=0;//     iget v10, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     sub-int v10, v4, v10
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int/2addr v10, v11
a=0;// 
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     iget v11, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     sub-int/2addr v4, v11
a=0;// 
a=0;//     invoke-virtual {v8, v2, v10, v9, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v11=(Conflicted);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int v4, v11, v10
a=0;// 
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v4, v12, :cond_6
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     add-int/2addr v9, v2
a=0;// 
a=0;//     add-int/2addr v10, v4
a=0;// 
a=0;//     invoke-virtual {v8, v2, v4, v9, v10}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     add-int v12, v4, v10
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     sub-int v13, v11, v13
a=0;// 
a=0;//     if-le v12, v13, :cond_5
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     sub-int v4, v11, v4
a=0;// 
a=0;//     sub-int/2addr v4, v10
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Byte);v1=(Null);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->n:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->o:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x50 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final onMeasure(II)V
a=0;//     .locals 12
a=0;// 
a=0;//     const/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v7, -0x80000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v3, v11, :cond_0
a=0;// 
a=0;//     if-eq v5, v11, :cond_d
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     if-eq v3, v7, :cond_1
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_1
a=0;//     if-eq v5, v7, :cond_d
a=0;// 
a=0;//     if-nez v5, :cond_d
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v2, v1}, Landroid/support/v4/widget/DrawerLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->z:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Boolean);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ad;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Integer);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v4, v6, :cond_c
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-eq v0, v8, :cond_3
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8, v5}, Landroid/support/v4/view/g;->a(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-static {v7}, Landroid/support/v4/view/ad;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     sget-object v9, Landroid/support/v4/widget/DrawerLayout;->d:Landroid/support/v4/widget/b;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/b;);
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->z:Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v9, v7, v10, v8}, Landroid/support/v4/widget/b;->a(Landroid/view/View;Ljava/lang/Object;I)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {v7}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/widget/f;->leftMargin:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v8, v2, v8
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->rightMargin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-int/2addr v8, v9
a=0;// 
a=0;//     invoke-static {v8, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     sub-int v9, v1, v9
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v9, v0
a=0;// 
a=0;//     invoke-static {v0, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v7, v8, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     #v9=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(PosShort);v3=(Integer);v4=(Null);v6=(Boolean);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "DrawerLayout must be measured with MeasureSpec.EXACTLY."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Integer);v6=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v3=(Boolean);v4=(Integer);v6=(Integer);v7=(Reference,Landroid/view/View;);v8=(Integer);v9=(Boolean);v10=(Conflicted);
a=0;//     sget-object v9, Landroid/support/v4/widget/DrawerLayout;->d:Landroid/support/v4/widget/b;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/b;);
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->z:Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v9, v0, v10, v8}, Landroid/support/v4/widget/b;->a(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/Object;I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {v7}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/widget/DrawerLayout;->e(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0x7
a=0;// 
a=0;//     and-int/lit8 v9, v8, 0x0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "Child drawer has absolute gravity "
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     and-int/lit8 v0, v8, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_8
a=0;// 
a=0;//     const-string v0, "LEFT"
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " but this DrawerLayout already has a drawer view along that edge"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     and-int/lit8 v0, v8, 0x5
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     if-ne v0, v3, :cond_9
a=0;// 
a=0;//     const-string v0, "RIGHT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Integer);v2=(Integer);v3=(Boolean);
a=0;//     iget v8, p0, Landroid/support/v4/widget/DrawerLayout;->h:I
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->leftMargin:I
a=0;// 
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->width:I
a=0;// 
a=0;//     invoke-static {p1, v8, v9}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/widget/f;->topMargin:I
a=0;// 
a=0;//     iget v10, v0, Landroid/support/v4/widget/f;->bottomMargin:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v9, v0}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {v7, v8, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Reference,Landroid/support/v4/widget/f;);v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Child "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " at index "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Integer);v1=(PosShort);v3=(Integer);v4=(Null);v6=(Conflicted);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     check-cast p1, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->a:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->g(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(II)V
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$SavedState;->c:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v1, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/widget/f;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->a:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->p:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->b:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->q:I
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->c:I
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/y;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/y;->b(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->b:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/y;->b(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->u:F
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->v:F
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->s:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/y;);
a=0;//     float-to-int v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     float-to-int v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->u:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v0, v4
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->v:F
a=0;// 
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->a:Landroid/support/v4/widget/y;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/y;);
a=0;//     iget v4, v4, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v0, v0
a=0;// 
a=0;//     mul-float/2addr v3, v3
a=0;// 
a=0;//     add-float/2addr v0, v3
a=0;// 
a=0;//     mul-int v3, v4, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Float);v4=(Conflicted);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(PosByte);v4=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->s:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Float);v4=(Conflicted);v5=(Integer);v6=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final requestDisallowInterceptTouchEvent(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->r:Z
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->n:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setDrawerListener(Landroid/support/v4/widget/e;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->t:Landroid/support/v4/widget/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setDrawerLockMode(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(II)V
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setScrimColor(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->i:I
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setStatusBarBackground(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x15
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/a/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setStatusBarBackgroundColor(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->y:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
