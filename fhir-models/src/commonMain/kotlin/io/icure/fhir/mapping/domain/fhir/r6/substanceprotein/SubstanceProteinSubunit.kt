//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substanceprotein

import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This subclause refers to the description of each subunit constituting the SubstanceProtein. A
 * subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information
 * shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits
 * are not used to delineate domains within a single sequence. Subunits are listed in order of
 * decreasing length; sequences of the same length will be ordered by decreasing molecular weight;
 * subunits that have identical sequences will be repeated multiple times
 *
 * This subclause refers to the description of each subunit constituting the SubstanceProtein. A
 * subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information
 * shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits
 * are not used to delineate domains within a single sequence. Subunits are listed in order of
 * decreasing length; sequences of the same length will be ordered by decreasing molecular weight;
 * subunits that have identical sequences will be repeated multiple times.
 *
 * @param id Unique id for inter-element referencing
 * @param subunit Index of primary sequences of amino acids linked through peptide bonds in order of
 * decreasing length. Sequences of the same length will be ordered by molecular weight. Subunits that
 * have identical sequences will be repeated and have sequential subscripts
 * @param sequence The sequence information shall be provided enumerating the amino acids from N- to
 * C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino
 * acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using
 * the translated sequence; for synthetic peptide containing amino acids that are not represented with
 * a single letter code an X should be used within the sequence. The modified amino acids will be
 * distinguished by their position in the sequence
 * @param length Length of linear sequences of amino acids contained in the subunit
 * @param sequenceAttachment The sequence information shall be provided enumerating the amino acids
 * from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for
 * L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be
 * described using the translated sequence; for synthetic peptide containing amino acids that are not
 * represented with a single letter code an X should be used within the sequence. The modified amino
 * acids will be distinguished by their position in the sequence
 * @param nTerminalModificationId Unique identifier for molecular fragment modification based on the
 * ISO 11238 Substance ID
 * @param nTerminalModification The name of the fragment modified at the N-terminal of the
 * SubstanceProtein shall be specified
 * @param cTerminalModificationId Unique identifier for molecular fragment modification based on the
 * ISO 11238 Substance ID
 * @param cTerminalModification The modification at the C-terminal shall be specified
 */
@SerialName("SubstanceProteinSubunit")
@Serializable
public data class SubstanceProteinSubunit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Index of primary sequences of amino acids linked through peptide bonds in order of decreasing
   * length. Sequences of the same length will be ordered by molecular weight. Subunits that have
   * identical sequences will be repeated and have sequential subscripts
   */
  public val subunit: Int? = null,
  /**
   * The sequence information shall be provided enumerating the amino acids from N- to C-terminal
   * end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and
   * lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the
   * translated sequence; for synthetic peptide containing amino acids that are not represented with a
   * single letter code an X should be used within the sequence. The modified amino acids will be
   * distinguished by their position in the sequence
   */
  public val sequence: String? = null,
  /**
   * Length of linear sequences of amino acids contained in the subunit
   */
  public val length: Int? = null,
  /**
   * The sequence information shall be provided enumerating the amino acids from N- to C-terminal
   * end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and
   * lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the
   * translated sequence; for synthetic peptide containing amino acids that are not represented with a
   * single letter code an X should be used within the sequence. The modified amino acids will be
   * distinguished by their position in the sequence
   */
  public val sequenceAttachment: Attachment? = null,
  /**
   * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID
   */
  public val nTerminalModificationId: Identifier? = null,
  /**
   * The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified
   */
  public val nTerminalModification: String? = null,
  /**
   * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID
   */
  public val cTerminalModificationId: Identifier? = null,
  /**
   * The modification at the C-terminal shall be specified
   */
  public val cTerminalModification: String? = null,
) : BackboneElement
