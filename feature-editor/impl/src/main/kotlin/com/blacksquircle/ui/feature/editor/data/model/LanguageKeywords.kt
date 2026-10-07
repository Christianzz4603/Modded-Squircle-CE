/*
 * Copyright Squircle CE contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blacksquircle.ui.feature.editor.data.model

/**
 * Keyword lists used by the editor's code completion (shown as suggestions while typing).
 */
internal object LanguageKeywords {

    fun forScope(scope: String): Array<String>? {
        return keywords[scope]
    }

    private val keywords: Map<String, Array<String>> by lazy {
        mapOf(
            LanguageScope.BAT to words(KW_BAT),
            LanguageScope.C to words(KW_C),
            LanguageScope.CLOJURE to words(KW_CLOJURE),
            LanguageScope.CPP to words(KW_C, KW_CPP),
            LanguageScope.CSHARP to words(KW_CSHARP),
            LanguageScope.CSS to words(KW_CSS),
            LanguageScope.DART to words(KW_DART),
            LanguageScope.DOCKER to words(KW_DOCKER),
            LanguageScope.FORTRAN to words(KW_FORTRAN),
            LanguageScope.FSHARP to words(KW_FSHARP),
            LanguageScope.GO to words(KW_GO),
            LanguageScope.GROOVY to words(KW_GROOVY),
            LanguageScope.HTML to words(KW_HTML),
            LanguageScope.JAVA to words(KW_JAVA),
            LanguageScope.JAVASCRIPT to words(KW_JS),
            LanguageScope.JULIA to words(KW_JULIA),
            LanguageScope.KOTLIN to words(KW_KOTLIN),
            LanguageScope.LATEX to words(KW_LATEX),
            LanguageScope.LISP to words(KW_LISP),
            LanguageScope.LUA to words(KW_LUA),
            LanguageScope.MAKE to words(KW_MAKE),
            LanguageScope.PERL to words(KW_PERL),
            LanguageScope.PHP to words(KW_PHP),
            LanguageScope.PYTHON to words(KW_PYTHON),
            LanguageScope.RUBY to words(KW_RUBY),
            LanguageScope.RUST to words(KW_RUST),
            LanguageScope.SHELL to words(KW_SHELL),
            LanguageScope.SMALI to words(KW_SMALI),
            LanguageScope.SQL to words(KW_SQL),
            LanguageScope.TYPESCRIPT to words(KW_JS, KW_TS),
            LanguageScope.VISUALBASIC to words(KW_VB),
            LanguageScope.ZIG to words(KW_ZIG),
            LanguageScope.VUE to words(KW_JS, KW_VUE),
            LanguageScope.SWIFT to words(KW_SWIFT),
            LanguageScope.R to words(KW_R),
            LanguageScope.POWERSHELL to words(KW_POWERSHELL),
            LanguageScope.OBJC to words(KW_C, KW_OBJC),
            LanguageScope.LESS to words(KW_CSS),
            LanguageScope.SCSS to words(KW_CSS, KW_SCSS),
            LanguageScope.COFFEESCRIPT to words(KW_COFFEE),
            LanguageScope.PUG to words(KW_PUG),
            LanguageScope.HANDLEBARS to words(KW_HBS),
        )
    }

    private fun words(vararg groups: String): Array<String> {
        return groups
            .flatMap { it.trim().split(Regex("\\s+")) }
            .distinct()
            .toTypedArray()
    }

    private val KW_JS = """
        async await break case catch class const continue debugger default delete do else export
        extends false finally for function if import in instanceof let new null of return static
        super switch this throw true try typeof undefined var void while with yield get set
        console require module exports
    """.trimIndent()

    private val KW_TS = """
        abstract any as asserts boolean declare enum implements infer interface is keyof
        namespace never number object override private protected public readonly satisfies
        string symbol type unique unknown
    """.trimIndent()

    private val KW_C = """
        auto break case char const continue default do double else enum extern float for goto if
        inline int long register return short signed sizeof static struct switch typedef union
        unsigned void volatile while include define ifdef ifndef endif pragma NULL
    """.trimIndent()

    private val KW_CPP = """
        alignas alignof and bool catch class concept constexpr consteval constinit const_cast
        decltype delete dynamic_cast explicit export false friend mutable namespace new noexcept
        nullptr operator or override private protected public reinterpret_cast requires
        static_assert static_cast template this throw true try typeid typename using virtual
        final std
    """.trimIndent()

    private val KW_JAVA = """
        abstract assert boolean break byte case catch char class const continue default do
        double else enum extends final finally float for goto if implements import instanceof
        int interface long native new package private protected public return short static
        strictfp super switch synchronized this throw throws transient try void volatile while
        record sealed permits var yield true false null
    """.trimIndent()

    private val KW_KOTLIN = """
        abstract actual annotation as break by catch class companion const constructor continue
        crossinline data delegate do dynamic else enum expect external false final finally for
        fun get if import in infix init inline inner interface internal is it lateinit lazy
        noinline null object open operator out override package private protected public reified
        return sealed set super suspend tailrec this throw true try typealias typeof val value
        var vararg when where while
    """.trimIndent()

    private val KW_PYTHON = """
        False None True and as assert async await break class continue def del elif else except
        finally for from global if import in is lambda nonlocal not or pass raise return try
        while with yield self print len range
    """.trimIndent()

    private val KW_CSHARP = """
        abstract as base bool break byte case catch char checked class const continue decimal
        default delegate do double else enum event explicit extern false finally fixed float for
        foreach goto if implicit in int interface internal is lock long namespace new null
        object operator out override params private protected public readonly ref return sbyte
        sealed short sizeof stackalloc static string struct switch this throw true try typeof
        uint ulong unchecked unsafe ushort using virtual void volatile while async await var
        record init required yield get set
    """.trimIndent()

    private val KW_GO = """
        break case chan const continue default defer else fallthrough for func go goto if import
        interface map package range return select struct switch type var true false nil iota
        append cap close copy delete len make new panic print println recover string int int8
        int16 int32 int64 uint uint8 uint16 uint32 uint64 float32 float64 bool byte rune error
        any
    """.trimIndent()

    private val KW_RUST = """
        as async await break const continue crate dyn else enum extern false fn for if impl in
        let loop match mod move mut pub ref return self Self static struct super trait true type
        unsafe use where while Option Some None Result Ok Err String Vec Box println format
    """.trimIndent()

    private val KW_SWIFT = """
        associatedtype async await break case catch class continue default defer deinit do else
        enum extension fallthrough false fileprivate for func guard if import in init inout
        internal is let nil open operator private protocol public repeat rethrows return self
        Self static struct subscript super switch throw throws true try typealias var where
        while actor any some lazy weak unowned override final mutating nonmutating optional
        required convenience willSet didSet get set print
    """.trimIndent()

    private val KW_DART = """
        abstract as assert async await break case catch class const continue covariant default
        deferred do dynamic else enum export extends extension external factory false final
        finally for Function get hide if implements import in interface is late library mixin
        new null on operator part required rethrow return sealed set show static super switch
        sync this throw true try typedef var void while with yield print
    """.trimIndent()

    private val KW_RUBY = """
        BEGIN END alias and begin break case class def do else elsif end ensure false for if in
        module next nil not or redo rescue retry return self super then true undef unless until
        when while yield puts require require_relative attr_accessor attr_reader attr_writer
        include extend private protected public lambda proc raise
    """.trimIndent()

    private val KW_PHP = """
        abstract and array as break callable case catch class clone const continue declare
        default do echo else elseif empty enddeclare endfor endforeach endif endswitch endwhile
        enum extends final finally fn for foreach function global goto if implements include
        include_once instanceof insteadof interface isset list match namespace new null or print
        private protected public readonly require require_once return static switch throw trait
        true false try unset use var while xor yield self parent
    """.trimIndent()

    private val KW_LUA = """
        and break do else elseif end false for function goto if in local nil not or repeat
        return then true until while print pairs ipairs require tostring tonumber type table
        string math
    """.trimIndent()

    private val KW_SHELL = """
        if then else elif fi case esac for select while until do done in function time echo exit
        export local readonly return shift source unset set cd read test true false declare eval
        exec trap alias unalias printf
    """.trimIndent()

    private val KW_BAT = """
        echo off on set if else exist not goto call exit for in do rem pause cd copy del dir md
        mkdir move rd rmdir ren type start setlocal endlocal enabledelayedexpansion errorlevel
        equ neq lss leq gtr geq
    """.trimIndent()

    private val KW_SQL = """
        SELECT FROM WHERE INSERT INTO VALUES UPDATE SET DELETE CREATE TABLE ALTER DROP INDEX
        VIEW DATABASE JOIN INNER LEFT RIGHT OUTER FULL CROSS ON AS AND OR NOT NULL IS IN LIKE
        BETWEEN EXISTS GROUP BY ORDER HAVING LIMIT OFFSET DISTINCT UNION ALL CASE WHEN THEN ELSE
        END PRIMARY KEY FOREIGN REFERENCES DEFAULT UNIQUE CHECK CONSTRAINT COUNT SUM AVG MIN MAX
        ASC DESC BEGIN COMMIT ROLLBACK TRANSACTION TRUNCATE
    """.trimIndent()

    private val KW_HTML = """
        html head body title meta link script style div span p a img ul ol li table tr td th
        thead tbody form input button select option textarea label header footer nav main
        section article aside br hr class id href src alt type name value DOCTYPE
    """.trimIndent()

    private val KW_CSS = """
        color background background-color border border-radius margin padding width height
        display position top left right bottom flex flex-direction flex-wrap justify-content
        align-items align-self grid font-size font-family font-weight text-align text-decoration
        line-height overflow opacity z-index transition transform animation box-shadow cursor
        content visibility float clear gap important none auto inherit block inline inline-block
        absolute relative fixed sticky center solid
    """.trimIndent()

    private val KW_SCSS = """
        mixin include extend function return if else each for while use forward
    """.trimIndent()

    private val KW_JULIA = """
        abstract baremodule begin break catch const continue do else elseif end export false
        finally for function global if import let local macro module mutable nothing quote
        return struct true try tuple type using where while println
    """.trimIndent()

    private val KW_LISP = """
        defun defvar defparameter defmacro defstruct defclass defmethod defgeneric let lambda if
        cond when unless progn setq setf loop do dolist dotimes car cdr cons list append mapcar
        nil t quote funcall apply format print
    """.trimIndent()

    private val KW_CLOJURE = """
        def defn defmacro defprotocol defrecord deftype defmulti defmethod fn let loop recur if
        when cond case do ns require use import nil true false map reduce filter first rest cons
        conj assoc dissoc get println str atom
    """.trimIndent()

    private val KW_GROOVY = """
        abstract as assert boolean break byte case catch char class continue def default do
        double else enum extends false final finally float for if implements import in
        instanceof int interface long new null package private protected public return short
        static super switch this throw throws true try void while println
    """.trimIndent()

    private val KW_FSHARP = """
        abstract and as assert base begin class default delegate do done downcast downto elif
        else end exception extern false finally fixed for fun function global if in inherit
        inline interface internal lazy let match member module mutable namespace new not null of
        open or override private public rec return sig static struct then to true try type
        upcast use val void when while with yield printfn
    """.trimIndent()

    private val KW_FORTRAN = """
        program end subroutine function module use implicit none integer real double precision
        complex logical character dimension allocatable allocate deallocate if then else elseif
        endif do enddo while select case call return stop print write read open close contains
        intent in out parameter
    """.trimIndent()

    private val KW_PERL = """
        my our local use no package sub if elsif else unless while until for foreach do last
        next redo return print say die warn eval require qw defined undef scalar ref bless shift
        push pop split join map grep sort keys values exists delete
    """.trimIndent()

    private val KW_SMALI = """
        class method end field super implements locals registers line annotation invoke-virtual
        invoke-direct invoke-static invoke-super invoke-interface move-result move-result-object
        const const-string return return-void return-object new-instance iget iput sget sput if-
        eqz if-nez goto public private protected static final constructor
    """.trimIndent()

    private val KW_VB = """
        AddHandler And As Boolean ByRef Byte ByVal Call Case Catch Class Const Continue Date
        Decimal Declare Default Dim Do Double Each Else ElseIf End Enum Error Event Exit False
        Finally For Friend Function Get GoTo If Imports In Inherits Integer Interface Is Let
        Long Loop Me Module MustInherit MustOverride Namespace New Next Not Nothing Of Option
        Optional Or Overridable Overrides Private Property Protected Public ReadOnly ReDim
        Return Select Set Shared Short Single Static Step Stop String Structure Sub Then Throw
        To True Try Using Wend When While With WriteOnly
    """.trimIndent()

    private val KW_LATEX = """
        documentclass usepackage begin end section subsection subsubsection chapter paragraph
        title author date maketitle tableofcontents textbf textit emph underline item itemize
        enumerate figure table includegraphics caption label ref cite bibliography newcommand
        renewcommand input include frac sqrt sum int equation align
    """.trimIndent()

    private val KW_MAKE = """
        ifeq ifneq ifdef ifndef else endif include define endef export override vpath all clean
        install
    """.trimIndent()

    private val KW_ZIG = """
        addrspace align allowzero and anyframe anytype asm async await break callconv catch
        comptime const continue defer else enum errdefer error export extern fn for if inline
        linksection noalias nosuspend noinline opaque or orelse packed pub resume return struct
        suspend switch test threadlocal try union unreachable usingnamespace var volatile while
        true false null undefined
    """.trimIndent()

    private val KW_VUE = """
        v-if v-else v-else-if v-for v-bind v-on v-model v-show v-slot template script setup
        style props emit ref reactive computed watch onMounted defineProps defineEmits
    """.trimIndent()

    private val KW_DOCKER = """
        FROM RUN CMD LABEL MAINTAINER EXPOSE ENV ADD COPY ENTRYPOINT VOLUME USER WORKDIR ARG
        ONBUILD STOPSIGNAL HEALTHCHECK SHELL AS
    """.trimIndent()

    private val KW_R = """
        if else repeat while function for next break TRUE FALSE NULL NA Inf NaN library require
        return print paste paste0 cat c list vector data.frame matrix length seq rep sum mean
        median sd min max apply sapply lapply names nrow ncol head tail summary plot str is.null
        stop warning tryCatch
    """.trimIndent()

    private val KW_POWERSHELL = """
        begin break catch class continue data do dynamicparam else elseif end enum exit filter
        finally for foreach from function if in param process return switch throw trap try until
        using var while Write-Host Write-Output Get-ChildItem Get-Content Set-Content Get-Item
        Set-Location Get-Process Where-Object ForEach-Object Select-Object Import-Module Invoke-
        WebRequest
    """.trimIndent()

    private val KW_OBJC = """
        interface implementation end property protocol selector synthesize dynamic class try
        catch finally throw autoreleasepool nil NULL YES NO id self super BOOL NSString NSArray
        NSDictionary NSObject NSLog nonatomic strong weak copy assign readonly readwrite atomic
        retain IBOutlet IBAction instancetype
    """.trimIndent()

    private val KW_COFFEE = """
        and break by catch class continue do else extends false finally for if in instanceof is
        isnt loop new no not null of off on or return super switch then this throw true try
        typeof undefined unless until when while yes
    """.trimIndent()

    private val KW_PUG = """
        doctype html head body title meta link script style include extends block mixin each
        while if else case when default for in div span p a img ul ol li table form input button
        label h1 h2 h3 h4 h5 h6 header footer nav main section
    """.trimIndent()

    private val KW_HBS = """
        if else unless each with lookup log this helper partial block yield
    """.trimIndent()
}