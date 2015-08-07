package android.support.v4.c; class c { void a() { int a;
a=0;// .class final Landroid/support/v4/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:[I
a=0;// 
a=0;// .field static final b:[J
a=0;// 
a=0;// .field static final c:[Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     sput-object v0, Landroid/support/v4/c/c;->a:[I
a=0;// 
a=0;//     new-array v0, v1, [J
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/c/c;->b:[J
a=0;// 
a=0;//     new-array v0, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/c/c;->c:[Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a([III)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-gt v1, v2, :cond_1
a=0;// 
a=0;//     add-int v0, v1, v2
a=0;// 
a=0;//     ushr-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     aget v3, p0, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, p2, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     if-le v3, p2, :cond_2
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     xor-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     :cond_2
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     if-eq p0, p1, :cond_0
a=0;// 
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
